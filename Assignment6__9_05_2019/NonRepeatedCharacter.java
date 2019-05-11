public class NonRepeatedCharacter 
{
     public static void main(String[] args) 
     {
        
        String str;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter any string: "); 
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
             boolean unique = true;
             for (int j = 0; j < str.length(); j++) 
             {
                 if (i != j && str.charAt(i) == str.charAt(j)) 
                 {
                     unique = false;
                     break;
                 }
              }
             if (unique) 
             {
                 System.out.println("First non repeated characted in String " + str + "\" is:" + str.charAt(i));
                 break;
             }
             else
             {
                System.out.println("There are no non repeating character in given word..");
                break;
             }

         }

     }
}
