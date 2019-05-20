package com.ibm.eis.service;

import com.ibm.eis.bean.Employee;

public class EmployeeServiceClass implements EmployeeService {
	
	

	public void SchemeA(int salary) {
		// TODO Auto-generated method stub
		System.out.println("Scheme A");
		System.out.println("Premium Payable(pa)");
		System.out.println((salary * 10 / 100));
		System.out.println("Claim Amount for Sceheme A : 3Lakhs and additonal upto 7 Lakhs if appliccable");
	}

	public void SchemeB(int salary) {
		// TODO Auto-generated method stub
		System.out.println("Scheme B");
		System.out.println("Premium Payable(pa)");
		System.out.println((salary * 7 / 100));
		System.out.println("Claim Amount for Sceheme B : 2Lakhs and additonal upto 5 Lakhs if appliccable");
	}
	public void SchemeC(int salary) {
		// TODO Auto-generated method stub
		System.out.println("Scheme C");
		System.out.println("Premium Payable(pa)");
		System.out.println((salary * 5 / 100));
		System.out.println("Claim Amount for Sceheme A : 2Lakhs and additonal upto 4 Lakhs if appliccable");
	}


	
	public void checkPolicy(Employee em) {
		if((em.getSalary()>5000 && em.getSalary()<20000))
		{
		     em.setScheme("Scheme C");
		     SchemeC(em.getSalary());
		}
		else if((em.getSalary()>=20000 && em.getSalary()<40000))
		{
			em.setScheme("Scheme B");
			SchemeB(em.getSalary());
		}
			
		else if((em.getSalary()>=40000))
		{
			em.setScheme("Scheme A");
			SchemeA(em.getSalary());
		}
			else 
				em.setScheme("No Scheme");
		
	}
	
	
}
