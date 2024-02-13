import java.util.*;

public class testEmployee		//class testEmployee to test setter and getter methods of Employee class
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter choice: \n1. Print default values. \n2. Set values for Name, Age and Salary");
		byte ch=k.nextByte();	//get choice from user
		switch(ch)
		{
			case 1:
				Employee emp1=new Employee();	
				emp1.display();		//displaying default values for Name, Age and salary fields
			break;
			
			case 2:
				Employee emp2=new Employee();
				System.out.println("Enter values for Name, Age and Salary:");
				emp2.setName(k.next());		//setting values for Name, Age and Salary fields taking input from user 
				emp2.setAge(k.nextInt());
				emp2.setSalary(k.nextFloat());
				emp2.display();
			break;
			
			default:
				System.out.println("Invalid Input");
		}
	}
}
