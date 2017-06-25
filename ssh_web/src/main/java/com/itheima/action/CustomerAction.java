package com.itheima.action;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	
	private Customer customer = new Customer();
	
	public Customer getModel() {
		return customer;
	}
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * 保存客户
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception {
		customerService.save(customer);
		return SUCCESS;
	}

}
