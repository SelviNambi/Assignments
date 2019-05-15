import java.util.Scanner;
import java.util.ArrayList;
class Laptop{
    private Integer ramSize, hddSize;
    private String brand;
 
    Laptop(Integer ramSize, Integer hddSize, String brand ){
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
    }

    public String toString()
    {
        return ("RAM Size:" +this.ramSize + "Harddisk Size" +hddSize + "Brand :" +brand);
    }
 
    //Creating the getters
    public Integer getRamSize(){
        return this.ramSize;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
 
    public String getBrand(){
        return this.brand;
    }
    public void setRamSize(int new_ram){
         this.ramSize = new_ram;
    }
 
    public  void setHddSize(int new_size){
         this.hddSize = new_size;
    }
 
    public void setBrand(String new_brand){
         this.brand = new_brand;   }
}
 
class APICollectionOperationDemo{
    
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        //Store a Laptop object in the list
        list.add(new Laptop(4, 500, "IBM"));
        list.add(new Laptop(8, 800, "LENOVO"));
        list.add(new Laptop(6, 500, "Sony"));

        char ch , ch1;
        int choice;


 
         do{
        System.out.println("Enter your choice: \n 1.Add new Laptop \n 2.Viewing all Laptop \n 3.Search a Laptop details \n 4.Delete laptop details \n 5.Update details of laptop \n 6.Exit");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        
        //Laptop l = new Laptop(8, 600, "Lenovo");
        //list.add(l);
         //Display all laptop details
        switch(choice)
        {
            case 1:
            int ram , hdd ; 
            String brand;
            do{
            System.out.println("Adding value in list..");
            //list.add(new Laptop(10,300,"HP"));
            System.out.println("Enter RAM size..");
            ram = sc.nextInt();
            System.out.println("Enter HardDisk size..");
            hdd = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter brand of laptop..");
            brand = sc.nextLine();
            list.add(new Laptop(ram , hdd , brand));
                //System.out.println("Added..");
            System.out.println("Do you want to add more(Y/N):");
            ch1 = sc.next().charAt(0);
        }while(ch1 == 'y' || ch1 =='Y');
                
            
            break;




            case 2:
            System.out.println("Viewing all the values in list:");
                for(int i = 0; i < list.size() ; i++)
                 {
                    
                System.out.println("Ram : " + ((Laptop)list.get(i)).getRamSize());
                System.out.println("HDD Size : " + ((Laptop)list.get(i)).getHddSize());
                System.out.println("Brand : " + ((Laptop)list.get(i)).getBrand());
                }
                break;

            case 3:
            String brand_new;
            System.out.println("Searching list..");
            System.out.println("1.Search by Brand \n2.Search by index");
            int tempnum = sc.nextInt();
            if(tempnum == 1 || tempnum == 2)
            {
                switch(tempnum)
                {
                    case 1:
                    System.out.println("Enter Brand name to be searched..");
                    sc.nextLine();
                    brand_new = sc.nextLine();
                    for(int i = 0 ; i < list.size() ; i++)
                    {
                        if( brand_new.equalsIgnoreCase(((Laptop)list.get(i)).getBrand()))
                        {
                            System.out.println("Ram : " + ((Laptop)list.get(i)).getRamSize());
                            System.out.println("HDD Size : " + ((Laptop)list.get(i)).getHddSize());
                            System.out.println("Brand : " + ((Laptop)list.get(i)).getBrand());
                        }
                        // else
                        // {
                        //     System.out.println("No matching value found");
                        //     break;
                        // }
                       

                    }
                    break;


                    case 2:
                    System.out.println("Enter index to be searched..");
                    int temp = sc.nextInt();
                    if( temp < list.size())
                    {
                    
                    System.out.println("Ram : " + ((Laptop)list.get(temp)).getRamSize());
                    System.out.println("HDD Size : " + ((Laptop)list.get(temp)).getHddSize());
                    System.out.println("Brand : " + ((Laptop)list.get(temp)).getBrand());
                    }
                    else
                        System.out.println("Specified index does not exist..");


                }
            }
            break;



            case 4:
                System.out.println("Enter index to be deleted");
                int i  = sc.nextInt();
                if(i > list.size())
                    System.out.println("Specified index does not exist..");
                else
                {
                    list.remove(i);
                    System.out.println("List after removing values:");
                    for(int x = 0; x < list.size() ; x++)
                     {
                    System.out.println("Ram : " + ((Laptop)list.get(x)).getRamSize());
                    System.out.println("HDD Size : " + ((Laptop)list.get(x)).getHddSize());
                    System.out.println("Brand : " + ((Laptop)list.get(x)).getBrand());
                    }
                }
                break;
                

            case 5:
            {
                System.out.println("Updating values in list..");
                System.out.println("Enter index whose value to change..");
                int list_no = sc.nextInt();
                if(list_no < list.size())
                {
                System.out.println("Enter field to be changed..\n1.RAM size\n2.Harddisk size\n3.Brand name");
                int update = sc.nextInt();
                    if(update == 1)
                    {
                        System.out.println("Enter new RAM size");
                        int new_ram = sc.nextInt();
                        //System.out.println((Laptop)list.get(list_no));
                        //System.out.println(((Laptop)list.get(list_no)).setRamSize(new_ram));
                        //System.out.println( +((Laptop)list.get(list_no)).getRamSize());
                    }
                    else if(update == 2)
                    {
                        System.out.println("Enter new Hardisk size..");
                        int new_hdd = sc.nextInt();
                        //System.out.println(((Laptop)list.get(list_no)).setHddSize(new_hdd));

                        //System.out.println(new_hdd);

                    }
                    else if(update == 3)
                    {
                        System.out.println("Enter new Brand name..");
                        String new_brand = sc.nextLine();
                        //System.out.println(((Laptop)list.get(list_no)).setBrand(new_brand));
                        //System.out.println(new_hdd);
                    }
                }
                else
                    System.out.println("Specified index does not exist..");
                for(Object obj : list)
                    System.out.println(obj);
                break;
            }

                case 6:
                break;
                

                default:
                System.out.println("Enter valid option..");break;

        }
        System.out.println("Do you want to continue performing operations.. (Y/N)");
        ch = sc.next().charAt(0);
    }while(ch == 'y' || ch == 'Y');
        

    }
    
}
