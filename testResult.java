import java.util.*;

public class testResult
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=k.nextLine();
		System.out.println("Enter Id: ");
		int id=k.nextInt();
		Result res=new Result(name,id);
		System.out.println("Enter Semester (1/2):");
		int ch=k.nextInt();
		int a,b,c,d,e;
		System.out.println("Enter Marks:");
		a=k.nextInt();
		b=k.nextInt();
		c=k.nextInt();
		d=k.nextInt();
		if (ch==1)
		{
			System.out.println("Percetage: "+res.calculate(a,b,c,d)+"%");
		}
		else if (ch==2)
		{
			e=k.nextInt();
			System.out.println("Percetage: "+res.calculate(a,b,c,d,e)+"%");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}
}
