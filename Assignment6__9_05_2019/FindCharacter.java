import java.util.Scanner;
class FindCharacter
{
	public static void main(String arg[])
	{
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();
		int len = str.length();
		System.out.println("Enter index to find character");
		int index = sc.nextInt();
		
		if(index > len)
			System.out.println("Index greater than length..");
		else
		{
			char c = str.charAt(index);
			System.out.print("Character at specified index is.." +c);
		}
		if(str.charAt(index) == ' ')
			System.out.println("Space character..");
		
	}
}