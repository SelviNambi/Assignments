import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class EmployeeDetails
{
	private int id;
	private String name ,fname , lname;
	private int age;
	private String address;

	public Integer getId()
	{
		return this.id;
	}
	

	public String getAddress()
	{
		return this.address;
	}

	public Integer getAge()
	{
		return this.age;
	}
	public String getName()
	{

		return this.name;
	}

	public String getfName()
	{

		return this.fname;
	}

	public String getlName()
	{

		return this.lname;
	}


	public EmployeeDetails(int id, String name, int age, String address) 
	{
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;

        try
        {
        	String name_emp[]  = name.split(" ");
        	fname = name_emp[0];
        	lname = name_emp[1];
        	System.out.println();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}
	@Override
	public String toString()
	{
		return ("\nID:" +this.id + "\t First Name:" +this.fname + "\tLast Name:" +this.lname + "\t Age: " +this.age + "\t Address: " +this.address ) ; 
	}
}


class SortByID implements Comparator
{

	@Override
	public int compare(Object first , Object second)
	{
		return((EmployeeDetails)first).getId().compareTo(((EmployeeDetails)second).getId());
	}
}

class SortByAge implements Comparator
{
	@Override
	public int compare(Object first , Object second)
	{
		return((EmployeeDetails)first).getAge().compareTo(((EmployeeDetails)second).getAge());	
	}
}

class SortByAddress implements Comparator
{
	@Override
	public int compare(Object first , Object second)
	{
		return((EmployeeDetails)first).getAddress().compareTo(((EmployeeDetails)second).getAddress());	
	}
}

class SortByFirstName implements Comparator
{
	@Override
	public int compare(Object first , Object second)
	{
		return((EmployeeDetails)first).getfName().compareTo(((EmployeeDetails)second).getfName());	
	}
}

class SortByLastName implements Comparator
{
	@Override
	public int compare(Object first , Object second)
	{
		return((EmployeeDetails)first).getlName().compareTo(((EmployeeDetails)second).getlName());	
	}
}


class EmployeeSorting
{
	public static void main(String[] args) 
	{
	char ch;
	int choice;
		
	EmployeeDetails obj = new EmployeeDetails(101, "aaa kk" , 34 , "Banglore");
	EmployeeDetails ref = new EmployeeDetails(106, "ggg uhjn" , 24 , "Pune");
	EmployeeDetails obj1 = new EmployeeDetails(167, "sdc swze" , 45 , "Chennai");
	EmployeeDetails ref1 = new EmployeeDetails(145, "tyty ezre" , 27 , "Hyderabad");

	


	ArrayList list = new ArrayList();
	list.add(obj1);
	list.add(obj);
	list.add(ref1);
	list.add(ref);
	System.out.println("Value in list are.." +list);
	System.out.println("To add Employee details,Press 1");
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int n = sc.nextInt();
	if(n == 1)
	{
		
		System.out.println("Enter ID...");
		int emp_id = sc.nextInt();sc.nextLine();
		System.out.println("Enter Name..");
		String emp_name = sc.nextLine();
		System.out.println("Enter Age..");
		int emp_age = sc.nextInt();sc.nextLine();
		System.out.println("Enter Address..");
		String emp_addr = sc.nextLine();

		list.add(new EmployeeDetails(emp_id  , emp_name , emp_age , emp_addr));
	}
	
	//java.util.Scanner sc= new java.util.Scanner(System.in);
	do
	{
	System.out.println("Enter your choice for Sorting..\n 1.ID\n2.First Name \n 3.Last Name\n 4.Age\n 5.Address");
	choice  = sc.nextInt();
	
	switch(choice)
	{

		case 1:
		{
			System.out.println("After Sorting by ID..." + list);
			Collections.sort(list , new SortByID());
			break;
		}
		case 2:
		{
			System.out.println("After sorting by First Name.." + list);
			Collections.sort(list , new SortByFirstName());
			break;
		}
		case 3:
		{
			System.out.println("After sorting by Last Name.." + list);
			Collections.sort(list , new SortByLastName());
			break;
		}
		case 4:
		{
			Collections.sort(list , new SortByAge());
			System.out.println("After sorting by Age..."  + list);
			break;
		}
		case 5:
		{
			Collections.sort(list , new SortByAddress());
			System.out.println("After sorting by Address..." + list);
			break;
		}
		default:
		System.out.println("Enter valid Choice..");

	}
	System.out.println("Do you want to continue..(Y/N)");
	ch = sc.next().charAt(0);
	
}while(ch == 'y' || ch == 'Y');

	}

	
}

