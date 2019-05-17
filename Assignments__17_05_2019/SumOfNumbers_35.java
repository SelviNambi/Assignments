class SumOfNumbers_35
{
	public static void main(String[] args) {
		
		int num = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number..");
		num = sc.nextInt();

		SumOfNumbers_35 obj = new SumOfNumbers_35();
		obj.SumOfNumbers(num);
		
	}

	void SumOfNumbers(int limit)
	{
		int sum = 0;
		for(int i = 0 ; i <= limit ; i++)
		{
			if (i%3 == 0 || i%5 == 0) 
				sum = sum + i;
		}
		System.out.println("sum of n numbers is:" +sum);
	}
}