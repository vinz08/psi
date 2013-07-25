package com.dlhz.pss.base.dao;

import java.sql.SQLException;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dlhz.core.base.dao.BaseDao;

public class DepartmentDao extends BaseDao {
	private static final Logger LOG = Logger.getLogger(DepartmentDao.class);
	
	public void addDepartment(Map<String, Object> data) {
		try {
			this.insertToTable("pss_department", data);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}