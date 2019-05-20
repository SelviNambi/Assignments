package com.ibm.eis.daointerface;

import java.util.HashMap;
import java.util.Map;
import com.ibm.eis.bean.Employee;


public class DaoImplement {

	
	private Map<Integer,Employee> map=new HashMap<>();	
	public void storeIntoMap(Employee emp2) {
	
		map.put(emp2.getId() , emp2);
	}
	public Map<Integer , Employee> displayEmployee(Employee emp){
		
	        return map;
		
	}
}
	

	
	
	


