package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
	Employee getEmployeeDetails();
	String findInsuranceScheme(Employee emp);
	void displayDetails(Employee emp);

}
