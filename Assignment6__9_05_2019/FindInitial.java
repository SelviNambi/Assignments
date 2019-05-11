class FindInitial { 
      
   void Initials()
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter Full name:" );
        String name=sc.nextLine();
        int len=name.length();
        int pos=0;
        for(int i = len-1; i >= 0; i--)
        {
            char ch=name.charAt(i);
            if(ch==' ')
            {
                pos=i;
                break;
            }
        }
        System.out.print("The initials are: ");
        System.out.print(name.charAt(0)+".");
        for(int x = 1 ; x <= pos ; x++)
        { 
            char ch=name.charAt(x);
            if(ch==' ')
            {
                                
                System.out.print(name.charAt(x+1)+".");
            }
        }
         
    }
    public static void main(String[] args) {
        FindInitial obj = new FindInitial();
        obj.Initials();
    }
} 