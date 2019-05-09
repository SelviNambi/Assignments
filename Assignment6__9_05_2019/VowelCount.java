//Program to count the number of vowels in given string

import java.util.regex.*;

class VowelCount
{
	
	public static void main(String a[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = new String();
		System.out.println("Enter a string");
		str = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i< str.length() ; i++)
		{
			 if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
			 str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' )
			 	count++ ;
		}
		
		System.out.println("Count of Vowels :" +count);

	}
}