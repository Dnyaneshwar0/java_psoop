import java.util.*;
public class testTime
{
	public static void main(String args[])
	{
		Time ob=new Time();		//creating object of Time class
		Scanner k=new Scanner(System.in);
		int l_ch=0;
		do
		{
			System.out.println("Enter choice for input format:\n1.Total Seconds\n2.Hrs, Mins, Secs");
			int ch=k.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter value for total seconds:");
					int tsec=k.nextInt();
					ob.conversion1(tsec);	//using overloaded method to convert total seconds to hours, minutes and seconds
				break;
				
				case 2:
					System.out.println("Enter values for hours, minutes and seconds:");
					int hr=k.nextInt();
					int min=k.nextInt();
					int sec=k.nextInt();
					ob.conversion2(hr,min,sec);		//using overloaded method to convert hours, minutes and seconds to total seconds
				break;
				
				default:
					System.out.println("Invalid Input...!");	//default error statement
				
			}
			System.out.println("Enter 0 to continue:");		//deciding to continue to menu from user input
			l_ch=k.nextInt();
		}while(l_ch==0);
	}
}
