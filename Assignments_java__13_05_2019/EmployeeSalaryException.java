//Create user defined exception to check if salary is below 3000
package exception;

class EmployeeException extends Exception
{
	EmployeeException(String str)
	{
		super(str);
	}
	public String toString()
	{
		return ("Salary is less than 3000");	
	}
}

public class EmployeeSalaryException
{
	public static void main(String[] args) throws EmployeeException{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double salary;
		System.out.println("Enter Salary");
		salary = sc.nextDouble();
		try
		{
			if(salary < 3000)
				throw new EmployeeException("Salary less than 3000");
		}
		catch(EmployeeException e)
		{
			 System.out.println(e);
		}
	}
}