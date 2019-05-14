
class TrafficSimulation
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a choice...\n 1.Red\n 2.Yellow\n 3.Green\n");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
			{
			System.out.println("You cannot go..Stop");
			break;
			}

			case 2:
			{
			System.out.println("Ready");
			break;
			}

			case 3:
			{
			System.out.println("You can Go..");
			break;
			}

			default:
			 System.out.println("Enter valid choice..");
			 break;
		}
	}
}
