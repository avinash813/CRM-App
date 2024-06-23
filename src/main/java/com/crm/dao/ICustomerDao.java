package com.crm.dao;

import org.springframework.data.repository.CrudRepository;

import com.crm.model.CustomerInfo;

public interface ICustomerDao extends CrudRepository<CustomerInfo, Integer> 
{
	

}
