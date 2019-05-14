//Create user defined exception to check if age is below 15

class MyException extends Exception
{
	MyException(String str)
	{
		super(str);
	}
	public String toString()
	{
		return ("Age must be above 15");	
	}
}
class AgeValidate
{
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int age;
		System.out.println("Enter age of the user..");
		age = sc.nextInt();
		try
		{
			if(age < 15)
				throw new MyException("age should be above 15");
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}