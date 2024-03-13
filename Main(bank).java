import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter choice: \n1.SBI \n2.ICICI \n3.AXIS");
		switch(k.nextInt())
		{
			case 1:
				SBI sbi=new SBI();
				
			break;
			case 2:
				ICICI icici=new ICICI();
				
			break;
			case 3:
				AXIS axis=new AXIS();
				
			break;
			default:
				System.out.println("Invalid Input");
		}
		
	}
}
