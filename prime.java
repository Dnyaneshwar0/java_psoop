import java.util.Scanner;
public class prime
{
	public boolean isPrime(int n) 	//to check if the given number is prime
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public void inp()	//to input endpoints for a range of numbers
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter end points of range: ");
		int a=k.nextInt();
		int b=k.nextInt();
		check(a,b); 
	}
	public void check(int n1, int n2)	//to iterate through each number in the given range and print if it is prime or not
	{
		int c=0;
		for(int i=n1;i<=n2;i++)
		{
			if(isPrime(i))		//calling funtion to check if the given number is prime 
			{
				++c;
				System.out.println(i+" is a Prime Number.");
			}
			else
			{
				System.out.println(i+" is not a Prime Number");
			}
		}
		System.out.println("\nTotal number of Prime Numbers = "+c); //prints total number of Prime Numbers in given range
	}
	public static void main(String args[])
	{
		prime ob=new prime();
		ob.inp();		
	}
}
