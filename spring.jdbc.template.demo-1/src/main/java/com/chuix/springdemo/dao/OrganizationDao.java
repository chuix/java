package com.chuix.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.chuix.springdemo.domain.Organization;

public interface OrganizationDao {
	
	// set datasource that will be requiered to create a connection to database
	public void setDataSource(DataSource ds);
	
	// create a record in organization table 
	public boolean create(Organization org);
	
	// retrieve a single organization
	public Organization getOrganization(int id);
	
	// retrieve all organization from the table 
	public List<Organization> getAllOrganization();
	
	// delete a specific organization from the table
	public boolean delete(Organization org);
	
	// update the specific organization
	public boolean update(Organization org);
	
	public void cleanup();
	
	

}
