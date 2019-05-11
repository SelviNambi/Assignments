//Program to get float numbers from users Dynamically and Adding numbers

public class FloatAdd 
{
	public static void main( String a[] ) 
	{
		float num[] = new float[100];
		float sum = 0 ;
		if(a.length < 2)
			System.out.println("Addition cannot be performed");
		else
		{
			for(int i=0; i<a.length; i++)
			{
				num[i] = Float.parseFloat(a[i]);
			}
			for(float i : num)
				sum += i;
			
		  System.out.println("The sum is ");
		  System.out.println(String.format("%.2f", sum));
		}
	}
}