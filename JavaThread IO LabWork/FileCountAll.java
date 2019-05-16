import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;

class FileCountAll
{
	public static void main(String[] args) 
	{
		 int count = 0 , lines = 1;
		 String word[] = new String[100];
		File file = new File("Ex1.txt");
		try
		{
			if(file.exists())
			{

				BufferedReader br = new BufferedReader(new FileReader(file));
				int ch =1;
				
				
					while((ch = br.read()) != -1)
					{
							
						if((char)ch == '\n')
							lines++;
						 word[] = br.readLine().split("\\s");
						// for(String val : word )
						// 	System.out.println(val);
						System.out.print((char)ch);
						count++;
					}
				}
				System.out.println("Count of words : " +word.length);
				System.out.println("\nCount of Character :" +count);
				System.out.println("\nno of lines:" +lines);
			}	
			

		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
