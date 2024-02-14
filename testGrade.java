import java.util.*;

class testGrade
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter number of Students");
		GradeStatistics ob=new GradeStatistics(k.nextInt());
		ob.input();
		ob.display();
			
		System.out.println("The average is: "+ob.average());
		System.out.println("The median is: "+ob.median());
		System.out.println("The minimum is: "+ob.min());
		System.out.println("The maximum is: "+ob.max());
		System.out.println("The standard deviation is: "+ob.reduce(ob.std_dev()));
	}
}
