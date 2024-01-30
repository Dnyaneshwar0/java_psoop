import java.util.Scanner;
public class ev_odd
{
	public int print(int n1, int n2, int rem) //to check if number is even or odd and also count it
	{
		if(rem==0)
		{
			System.out.print("\nEven numbers in given range: ");
		}
		else if(rem==1)
		{
			System.out.print("\nOdd numbers in given range: ");
		}
		int c=0,i=0;
		for(i=n1;i<=n2;i++)
		{
			if(i%2==rem)		//odd numbers have a remainder 1 and even numbers have remainder 0
			{
				System.out.print(i+", ");
				++c;
			}
		}
		if(i==0)
		{
			System.out.println("No numbers present");		//in case no valid numbers are present in the given range
		}
		return c;
	}
	public void display()		//to take input and display output
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter endpoints of range:");
		int a=k.nextInt();
		int b=k.nextInt();
		int n_even=print(a,b,0);
		int n_odd=print(a,b,1);
		System.out.println("\nNumber of Even Numbers="+n_even+"\nNumber of Odd Numbers= "+n_odd);
	}
	public static void main(String args[])
	{
		ev_odd ob=new ev_odd();
		ob.display();
	}
}
