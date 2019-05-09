//Program to get numbers from users Dynamically and Adding numbers

public class RuntimeAdd 
{
	public static void main( String a[] ) 
	{
		int num=0;
		int len = a.length;
		if(len < 2)
			System.out.println("Error in number of input");
		else
		{
			for(int i=0; i<a.length; i++)
			{
			   num+= Integer.parseInt(a[i]);
			}

			  System.out.println("The sum is " + num);
		}
	}
}