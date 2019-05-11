class DuplicateChar
{

public static void main(String[] args) 
{
		String str;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter any string: "); 
        str = sc.nextLine();
		char[] characters = str.toCharArray();
		//int length = characters.length;
        int length = str.length();
    	for (int i = 0; i < length; i++) 
        {
                for (int j = i + 1; j < length; j++) 
                {
                    if (characters[i] == characters[j]) 
                    {
                        int temp = j;
                        
                        for (int k = temp; k < length - 1; k++) 
                        {
                        	characters[k] = characters[k + 1];
                        }
                        j--;
                        length--;
     
                    }
                }
            }
	String newstr = new String(characters);
	newstr = newstr.substring(0, length);
	System.out.println("String after duplicates removed : " + newstr);
}
}