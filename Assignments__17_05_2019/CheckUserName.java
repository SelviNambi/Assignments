import java.util.regex.Pattern;  
import java.util.regex.Matcher;   

class CheckUserName
{
	public static void main(String[] args) {
		
		String uname = new String();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter user name..(With pattern: --------_job");
		uname = sc.nextLine();
		int len = uname.length();
		if(len < 12)
			System.out.println("Please provide user name of length 8 and above..");
		else
		{
			String pattern = "[a-z]{8}_[job]+";
			if(uname.matches(pattern))
				System.out.println("Perfect User Name");
			else
				System.out.println("Incorrect UserName");
		}

	}
}