class CheckPower2
{
	
	 public static void main(String[] args)
	  {
	  	CheckPower2 obj = new CheckPower2();
	    java.util.Scanner in = new java.util.Scanner(System.in);
	    System.out.println("Enter a number to check");
	    int number = in.nextInt();
	    in.close();

	    if (obj.isPowerOfTwo(number)) 
	    {
	      System.out.println("Number is power of 2");
	    } else 
	    {
	      System.out.printf("Number is not power of 2");
	    }
  	}

	 public boolean isPowerOfTwo(int number) 
	 {

	    if (number % 2 != 0) 
	    {
	      return false;
	    } 
	    else 
	    {

	      for (int i = 0; i <= number; i++) 
	      {

	        if (Math.pow(2, i) == number) 
	        	return true;
	      }
	    }
    return false;
  	}
}

