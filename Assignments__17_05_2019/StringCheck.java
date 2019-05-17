import java.util.StringTokenizer;
import java.util.Arrays;

class StringCheck
{
	public static void main(String[] args) 
	{
		
		String str = new String();
		char ch[] = new char[100];
		java.util.Scanner sc= new java.util.Scanner(System.in);
		str= sc.nextLine();
		int len = str.length();
		boolean sorted = true;
		for(int i = 0; i < len-1; i++){
		    if(str.charAt(i) >= str.charAt(i+1)){
		      sorted = false;
		      break;
		    }
		}
		if(sorted){
		    System.out.println("Positive String");
		}else{
		    System.out.println("Not Positive String");
		}
	}
}