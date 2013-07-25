package com.dlhz.pss.inventory.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dlhz.pss.inventory.entity.Sort;
import com.dlhz.pss.inventory.entity.form.SortForm;
import com.dlhz.pss.inventory.service.SortService;

@Controller
@RequestMapping("/inventory/sort")
public class SortController {

	@Autowired
	private SortService sortService;

	@ResponseBody
	@RequestMapping("/add")
	public String addSort(Sort sort) {
		return String.valueOf(sortService.addSort(sort));
	}
	
	@ResponseBody
	@RequestMapping(value = "/addre", produces = "application/json;charset=utf-8")
	public String addSortReturn(Sort sort) {
		return JSON.toJSONString(sortService.addSortReturn(sort));
	}
	
	@ResponseBody
	@RequestMapping(value = "/child", produces = "application/json;charset=utf-8")
	public String querySort(String parentId) {
		return JSON.toJSONString(sortService.querySort(parentId));
	}

	@RequestMapping("/list")
	public String querySort(ModelMap map) {
		String parentId = "0";
		List<SortForm> list = sortService.querySort(parentId);
		map.put("sortList", JSON.toJSONString(list));
		return "inventory/sortlist";
	}
	
	/*@ResponseBody
	@RequestMapping(value = "/ajaxlist", produces = "application/json;charset=utf-8")
	public String querySort() {
		List<SortForm> list = sortService.queryMainSort();
		return JSON.toJSONString(list);
	}*/
	
	@ResponseBody
	@RequestMapping("/edit")
	public String editSort(String id, String name, String parentId, String main) {
		return String.valueOf(sortService.editSort(id, name, parentId, main));
	}
	
	@ResponseBody
	@RequestMapping("/del")
	public String deleteSort(String idStr) {
		return String.valueOf(sortService.deleteSort(idStr));
	}
}