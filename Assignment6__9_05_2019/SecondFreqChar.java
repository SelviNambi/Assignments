 // finds the second most frequently occurring Character

class SecondFreqChar
{
	static final int CharCount = 256; 
      
    
    static char getSecondMostFreq(String str) 
    { 
        
        int[] count = new int[CharCount]; 
        int i; 
        for (i=0; i< str.length(); i++) 
            (count[str.charAt(i)])++; 
       
        int first = 0, second = 0; 
        for (i = 0; i < CharCount; i++) 
        { 
            
            if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            } 
       
            else if (count[i] > count[second] && 
                count[i] != count[first]) 
            second = i; 
        } 
       
        return (char)second; 
    } 
       
     
    public static void main(String args[]) 
    { 
    	  java.util.Scanner sc = new java.util.Scanner(System.in);
		  String str = new String();
		  System.out.println("Enter a string.."); 
		  str = sc.nextLine();
	      char res = getSecondMostFreq(str); 
	      if (res != '\0') 
	         System.out.println("Second most frequent char is " + res); 

	      else
	         System.out.println("No second most frequent character"); 
    } 
}