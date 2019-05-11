//Program to check if a given string contains the specified sequence of char values

class ContainString
{
	public static void main(String a[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = new String();
		String test = new String();
		System.out.println("Enter string ");
		str = sc.nextLine();
		System.out.println("Enter test string to be tested..");
		test = sc.nextLine();
		if(str.contains(test))
			System.out.println("Test string is contained in String");
		else
			System.out.println("Test string is not in String");


	}
}