
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

class StringObjectArray 
{
	public static void main(String[] args) {
		
		String str , temp;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter a string");
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str , " ");
		 while(st.hasMoreElements())
        {
        	
          temp = st.nextToken();
          list.add(temp);
      	}
      	Collections.sort(list);
      	System.out.println(list);

      	int size = list.size();
      	System.out.println("Size of list is..." +size);
      	      	System.out.println();

      	if((size % 2) == 0)
      	{
      		for(int i = 0; i < (size/2) ; i++)
      			System.out.println(list.get(i).toUpperCase());
      		for(int i = (size/2) ; i < size ; i++)
      			System.out.println(list.get(i).toLowerCase());
      	}
      	else
      	{
      		for(int i = 0; i <= (size/2) ; i++)
      			System.out.println(list.get(i).toUpperCase());
      		for(int i = (size/2)+1; i < size  ; i++)
      			System.out.println(list.get(i).toLowerCase());	
      	}

	}
}
    