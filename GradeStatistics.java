import java.util.*;

class GradeStatistics
{
	int stud[];
	
	GradeStatistics(int n) 	//Parameterised constructor to create array of length equal to number of students
	{
		stud=new int[n];
	}
	
	void display()		//Method to display array of grades entered
	{
		System.out.println("Students grade:");
		for(int i=0;i<stud.length;i++)
		{
			System.out.print(stud[i]+" ");
		}
		System.out.println();
	} 
	
	void input()	//Method to input array of grades
	{
		Scanner k=new Scanner(System.in);
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter grade for student "+(i+1)+": ");
			stud[i]=k.nextInt();
		}
		if(check())
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		sort();
	}
	
	boolean check()		//Method to check if grades entered are in correct range
	{
		for(int i=0;i<stud.length;i++)
		{
			if(stud[i]<0 && stud[i]>100)
			{
				System.out.println("check er");
				return true;
			}
		}
		return false;
	}
	
	void sort()		//Method to sort the array of grades
	{
		for(int i=0;i<stud.length;i++)
		{
			for(int j=0;j<stud.length-i-1;j++)
			{
				if(stud[j]>stud[j+1])
				{
					int temp=stud[j];
					stud[j]=stud[j+1];
					stud[j+1]=temp;
				}
			}
		}
	}
	
	int max()		//Method to calculate maximum grade
	{	
		int max=stud[0];
		for(int i=1;i<stud.length;i++)
		{
			if(stud[i]>max)
			{
				max=stud[i];
			}
		}
		return max;
	}
	
	int min()		//Method to calculate minimum grade
	{
		int min=stud[0];
		for(int i=1;i<stud.length;i++)
		{
			if(stud[i]<min)
			{
				min=stud[i];
			}
		}
		return min;
	}
	
	double median()		//Method to calculate median grade
	{
		if(stud.length%2==0)
		{
			return (double)(stud[stud.length/2]+stud[(stud.length/2)-1])/2;
		}
		else
		{
			return stud[stud.length/2+1];
		}
	}
	
	double average()		//Method to calculate average grade
	{
		double avg=0;
		for(int num:stud)
		{
			avg+=num;
		}
		return avg/stud.length;
	}
	
	double std_dev()		//Method to calculate standard deviation in the grades
	{
		double mean=average();
		double dev_sum=0;
		for(int num:stud)
		{
			dev_sum+=(Math.pow((num-mean),2))/stud.length;
		}
		return Math.sqrt(dev_sum);
	}
	
	double reduce(double num)		//Method to round given value to 2 decimal places
	{
		double temp=(double)Math.round(num*100);
		
		return (temp/100);
	}
	
}
