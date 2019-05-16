import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;

class FileRead
{
	public static void main(String[] args) 
	{
		int charcount = 0 , lines = 0 , wordCount = 0;
		File file = new File("readsample.txt");
		try
		{
			if(file.exists())
			{
				//file.createNewFile();
				BufferedReader br = new BufferedReader(new FileReader(file));
				String ch;
				while((ch = br.readLine()) != null)
				{
					
					String[] wordList = ch.split("\\s+"); 
	                  
	                wordCount += wordList.length; 

					lines++;
    	          		
	            }
	            
	            int value ;

	            while((value = br.read()) != -1)
						++charcount;
			}
			System.out.println("\nCount of Character :" +charcount);
			System.out.println("\nno of lines:" +lines);
			System.out.println("\n Number of words:" +wordCount);

		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}