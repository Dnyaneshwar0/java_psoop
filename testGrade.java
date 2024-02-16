import java.util.*;

class testGrade
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter number of Students");
		GradeStatistics ob=new GradeStatistics(k.nextInt());
		ob.input();		//Getting input from user for grades
		ob.display();	//Displaying entered grades
			
		System.out.println("The average is: "+ob.average());	//Calling method to print average grade
		System.out.println("The median is: "+ob.median());	//Calling method to print median grade
		System.out.println("The minimum is: "+ob.min());	//Calling method to print minimum grade
		System.out.println("The maximum is: "+ob.max());	//Calling method to print maximum grade
		System.out.println("The standard deviation is: "+ob.reduce(ob.std_dev()));	//Calling method to print standard deviation in grade
	}
}
