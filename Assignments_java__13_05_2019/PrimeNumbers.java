import java.util.Scanner;
class PrimeNumbers
{
   public static void main (String[] args)
   {		
      Scanner sc = new Scanner(System.in);
      int i =0;
      int num =0;
      int primeNumber = 0;
      System.out.print("Enter the value of n:");
      int n = sc.nextInt();
      scanner.close();
      System.out.println("Prime numbers from 1 to n are :");
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter == 2)
	 {
      
      System.out.println(i);
	 }	
      }	
      
   }
}