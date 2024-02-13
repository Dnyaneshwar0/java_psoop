import java.util.*;

public class testLine
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter type of equation: \n1. Slope-Y intercept form \n2. Slope-Point form \n3. Two-Point form");
		byte ch=k.nextByte();
		switch(ch)
		{
			case 1:
				System.out.println("Enter values for slope(m) and Y-Intercept:");
				Line l1=new Line(k.nextDouble(), k.nextDouble()); 	//calling constructor for slope-yint form of line
			break;
			
			case 2:
				System.out.println("Enter values for slope(m), x1 and y1:");
				Line l2=new Line(k.nextDouble(), k.nextDouble(), k.nextDouble()); 	//calling constructor for slope-point form of line
			break;
			
			case 3:
				System.out.println("Enter values for x1 and y1:");
				Line l3=new Line(k.nextDouble(), k.nextDouble(), k.nextDouble(), k.nextDouble()); 	//calling constructor for two-point form of line
			break;
			
			default:
				System.out.println("Invalid Input");	//default error statement
		}
	}
}
