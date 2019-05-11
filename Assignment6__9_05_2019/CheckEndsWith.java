//To check whether given String ends with given another String
class CheckEndsWith
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

		if(str.endsWith(test))
			System.out.println("String ends with specified string");
		else
			System.out.println("String does not ends with test string");
	}
}