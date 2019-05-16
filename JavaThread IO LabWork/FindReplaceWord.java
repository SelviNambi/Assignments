import java.io.*;
// import java.io.BufferedReader;
// import java.io.PrintWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.lang.StringBuilder;


class FindReplaceWord
{
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		String findWord = " " , newWord = " " , ch , str = " ";
		StringBuilder sb = new StringBuilder();
		File file = new File("input.txt");

		System.out.println("Enter word to find");
		findWord = sc.nextLine();

		System.out.println("Enter word to be replaced");
		newWord = sc.nextLine();

		try
		{
			if(file.exists())
			{
				BufferedReader br = new BufferedReader(new FileReader(file));
				
				while( (ch = br.readLine()) != null)
				{
					ch = ch.replaceAll(findWord , newWord);
					str += ch;
					//str += ch ;
				}
				//System.out.println(sb);
				br.close();

				BufferedWriter bwrite = new BufferedWriter(new FileWriter(file));
				bwrite.write(str);
				bwrite.flush();
				bwrite.close();
				System.out.println("Replaced Word Successfully...");
				// System.out.println("Content of file are..");
				// while( (ch = br.readLine()) != null)
				// {
				// 	System.out.println(ch);
				// }
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}