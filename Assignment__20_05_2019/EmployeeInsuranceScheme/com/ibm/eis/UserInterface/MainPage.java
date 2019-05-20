package com.ibm.eis.ui;
import java.util.Scanner;

//import java.util.Map.Entry;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.daointerface.DaoImplement;
import com.ibm.eis.service.EmployeeServiceClass;


public class MainPage {
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		EmployeeServiceClass empserv=new EmployeeServiceClass();
		DaoImplement dao = new DaoImplement();
		Employee emp = new Employee();
		String name = null,des = null;
		int id = 2,sal = 0;

	    
		System.out.println("Enter ID:" );
		id = sc.nextInt();
		emp.setId(id);
		sc.nextLine();
		System.out.println("Enter Name:");
		name = sc.nextLine();
		emp.setName(name);
		//System.out.println(name);
		System.out.println("Enter Designation");
		des = sc.nextLine();
		emp.setDes(des);
		System.out.println("Enter Salary");
		sal = sc.nextInt();
		emp.setSalary(sal);
	   
	
	    empserv.checkPolicy(emp);
		  dao.storeIntoMap(emp);
		  System.out.println(dao.displayEmployee(emp));
	}	 
	
}
