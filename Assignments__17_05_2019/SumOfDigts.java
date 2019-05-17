class SumOfDigts
{
	public static void main(String[] args) {
		
		int num;
		double sum = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		while(num != 0)
		{
			double temp = (num % 10);
			double cube = Math.pow(temp , 3);
			sum =sum + cube;
			num = num / 10;
		}
		System.out.println("Sum is: " +(int)sum);
		
	}
}