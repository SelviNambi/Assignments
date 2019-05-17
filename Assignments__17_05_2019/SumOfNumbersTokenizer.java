import java.util.StringTokenizer;
import java.util.ArrayList;

class SumOfNumbersTokenizer
{
	public static void main(String[] args) 
	{

		
		String number , numstr;
		Integer sum=0;
		int num = 0;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter numbers to be added..");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		number = sc.nextLine();
		StringTokenizer st1 = new StringTokenizer(number , " "); 
		
        while(st1.hasMoreElements())
        {
        	
          numstr = st1.nextToken();
          try
          {
          num = Integer.parseInt(numstr);
     	  }
     	  catch(Exception e)
     	  {
     	  	System.out.println("Only enter the number");
     	  }
     	  finally
     	  {
         	list.add(num);
     		}
       }
       //System.out.println("List length is" +list.size());
        for(int i=0 ; i < list.size() ; i++)
        	sum = sum + list.get(i);
        System.out.println("Sum is:" +sum);
	}
}
