import java.util.Scanner;

class CompareString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str1 = new String();
		String str2 = new String();
		System.out.println("Enter first String");
		str1 = sc.nextLine();
		System.out.println("Enter second String");
		str2 = sc.nextLine();
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		if( s1.equals(s2) )
			System.out.println(str1+ "  and " +str2+ " matches");
		else
			System.out.println(str1+ " and " +str2+ " does not matches");
	}
}