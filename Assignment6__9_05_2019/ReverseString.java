import java.util.Scanner;
 
class ReverseString
{
   public static void main(String args[])
   {
      String str;
      char[] rev = new char[100];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = sc.nextLine();
      
      int len = str.length();
      int i,j;
		for(i = len-1 , j = 0 ; i >=0 ; i-- , j++)
		{
			if(j < len)
				rev[j] = str.charAt(i);	
		}
		System.out.println(rev);
	}
}