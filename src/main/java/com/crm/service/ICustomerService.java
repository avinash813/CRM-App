package com.crm.service;
import com.crm.model.CustomerInfo;
import java.util.List;

public interface ICustomerService 
{
	public List<CustomerInfo> getCustomers();
	public void registerCustomer(CustomerInfo customer);
	public void deleteCx(Integer id);
	public CustomerInfo getCx(Integer id);

}
