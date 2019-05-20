package com.ibm.eis.service;

import com.ibm.eis.bean.Employee;

public interface EmployeeService {
	
	void checkPolicy(Employee emp);
	void SchemeA(int sal);
	void SchemeB(int sal);
	void SchemeC(int sal);
  }
