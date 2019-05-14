class MyException extends Exception
{
	MyException (String str)
	{
		super(str);
	}	
	public String toString()
	{
		return ("Both First name and Last name  should not be empty");
	}

}


class ValidateName 
{
	public static void main(String[] args) throws MyException {
		String fname = new String();
		String lname = new String();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter first name..");
		fname = sc.nextLine();
		System.out.println("Enter last name..");
		lname = sc.nextLine();
		//System.out.println( fname + lname);
		try
		{
			if((fname.equals("")) || (lname.equals("")))
				throw new MyException("Enter valid name");
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}