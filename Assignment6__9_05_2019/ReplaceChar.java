class ReplaceChar
{
	public static void main(String a[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = new String();
		String NewStr = new String();
		System.out.println("Enter string ");
		str = sc.nextLine();
		
			NewStr = str.replace('r' , 't');
		
		System.out.println(NewStr);
	}
}