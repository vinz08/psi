package com.vsoft.pss.organization.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsoft.core.util.DataUtil;
import com.vsoft.pss.organization.dao.OrganizationDao;
import com.vsoft.pss.organization.entity.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;

	public void addOrganization(Organization organization) {
		Map<String, Object> data = DataUtil.parseObjectToMap(organization, Organization.class);
		organizationDao.addOrganization(data);
	}
}