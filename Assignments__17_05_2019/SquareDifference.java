class SquareDifference
{
	public static void main(String[] args) {
		
		int num = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number..");
		num = sc.nextInt();

		SquareDifference obj = new SquareDifference();
		obj.getDiff(num);
	}

	void getDiff(int temp)
	{
		int sum = 0 , sum_num = 0;
		for(int i = 1 ; i <= temp ; i++)
		{
			sum = sum + (int)Math.pow(i , 2);
			sum_num = sum_num + i;
		}

		// System.out.println("Sum of square of numbers is:" +sum);
		// System.out.println("Sum of square of numbers is:" +sum_num);
		int result = (sum_num * sum_num)-sum;
		System.out.println("Difference in squares of sum of numbers and sum of squares of nos./ is:" +result );

	}
}