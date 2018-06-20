package com.chuix.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chuix.springdemo.dao.OrganizationDao;
import com.chuix.springdemo.daoImpl.OrganizationDaoImpl;
import com.chuix.springdemo.domain.Organization;

public class JdbcTemplateClassicApp1 {

	public static void main(String[] args) {

		//Create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create beans
		OrganizationDaoImpl dao = (OrganizationDaoImpl) ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganization();
		for(Organization org : orgs) {
			System.out.println(org);
		}
		
		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
