package com.ibm.eis.daointerface;
import java.util.Map;
import com.ibm.eis.bean.Employee;


public interface DaoInterface {

	
	void storeIntoMap(int x);
	Map<Integer,Employee> displayEmployee();
}
