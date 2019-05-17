import java.util.ArrayList;
import java.lang.StringBuffer;
class SortIntegerArray
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//Object of class
		SortIntegerArray obj = new SortIntegerArray();
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

        for(int i = 0 ; i < count ; i++)
			list.add(numbers[i]);


        //Reversing elemnets of the array
        System.out.println("Reversing numbers in array..");
        for(int x = 0 ; x < count ; x++)
        {
        	//System.out.println(list.get(x).toString());
        	StringBuffer sb = new StringBuffer("");
        	sb.append(list.get(x).toString());
        	sb.reverse();
        	System.out.println();
        	System.out.println(sb);

        }



		System.out.println("Array after Sorting...");
		obj.getSorted(numbers);
	}

	void getSorted(int[] temp)
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
	}




}