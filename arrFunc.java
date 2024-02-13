import java.util.Scanner;

public class arrFunc
{
	int arr[];
	
	arrFunc(int n)
	{
		arr=new int[n];
	}
	
	//input
	void input()
	{
		Scanner k=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=k.nextInt();
		}
	}
	
	//search
	int search(int val)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				return i;
			}
		}
	}
	
	//sort
	void sort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	//display
	void display()
	{
		System.out.println("Elements in array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
