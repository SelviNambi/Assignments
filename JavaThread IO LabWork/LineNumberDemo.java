
import java.io.*;
class LineNumberDemo
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fil;
		LineNumberInputStream line;
		int i;
		try
		{
			fil=new FileInputStream("readsample.txt");
			line=new LineNumberInputStream(fil);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No such file found");
			return;
		}
		do
		{
			i=line.read();
			//System.out.print(line.getLineNumber()+".");
			if(i=='\n')
			{
				System.out.println();
				System.out.print(line.getLineNumber()+")");
			}
			else
				System.out.print((char)i);
		}while(i!=-1);
		fil.close();
		line.close();
	}
}