import java.util.*;

public class testAvg
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		Average avg1=new Average();
		System.out.println("Enter values and 0 to calculate:");
		int sum=0,c=0;
		while(true)
		{
			int temp=k.nextInt();
			if(temp==0)
			{
				break;
			}
			sum+=temp;
			++c;
		}
		System.out.println(avg1.avg(sum,c));
	}
}
