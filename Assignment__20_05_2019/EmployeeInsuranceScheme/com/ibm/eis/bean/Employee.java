package com.ibm.eis.bean;

public class Employee {
	private int idno;
	private String name , des;
	public int sal;
	private String scheme;
	
	
//	public Employee(int id , String name , String des , int sal )
//	{
//		super();
//		this.idno = id;
//		this.name = name;
//		this.des = des;
//		this.sal = sal;
//		//this.scheme = scheme;
//	}
	public String toString()
	{
		return ("  ID:" +this.idno+ "  Name:" +this.name+ "  Designation: " +this.des+ "  Salary" +this.sal+  "Scheme:" +this.scheme );
	}
	public void setId(int id)
	{
		this.idno = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDesignation(String des)
	{
		this.des = des;
	}
	public void setSalary(int sal)
	{
		this.sal = sal;
	}
	public void setDes(String des)
	{
		this.des = des;
	}
	public void setScheme(String scheme)
	{
		this.scheme = scheme;
	}
	 public String getName() {
		 return this.name;
	 }
	 public String getdesignation() {
		 return this.des;
	 }
	 public String getIScheme() {
		 return this.scheme;
	 }
	 public int getId() {
		 return this.idno;
	 }
	 public Integer getSalary() {
		 return this.sal;
	 }
		
		
}
