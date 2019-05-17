class SecondSmallNumber
{
public static void main(String[] args) {
		
		SecondSmallNumber obj = new SecondSmallNumber();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter count of numbers...");
		int count = sc.nextInt();
        sc.nextLine(); // throw away the newline.

        int [] numbers = new int[count];
        //Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (sc.hasNextInt()) {
                numbers[i] = sc.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
        System.out.println("Array numbers are...");
        for(int x : numbers)
        	System.out.print(x+ " ");
        System.out.println();

        System.out.print("Sorted array is:");
        

        System.out.println("Second Smallest number is:" +obj.getSecondSmallest(numbers));
	}	

	public int getSecondSmallest(int[] temp)
	{
		int x;
		int n = temp.length;
		for(int i = 0; i < n; i++) {
         for(int j=1; j < (n-i); j++) {
            if(temp[j-1] > temp[j]) { 
               x = temp[j-1]; 
               temp[j-1] = temp[j];
               temp[j] = x;
            } 
         } 

      } 
      for(int disp : temp)
      	System.out.println(disp);
      return temp[1];
      
	}
}