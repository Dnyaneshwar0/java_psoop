import java.util.Scanner;

public class ArrFunc
{
	static Scanner k=new Scanner(System.in);
	
	static void input(int arr[])	//Method to take input for array
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=k.nextInt();
		}
	}
	
	static void search(int arr[])	//Method to search for an element in the array and print its index if found
	{
		System.out.println("Enter element to be searched:");
		int val=k.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("Element found at index: "+i);
				return;
			}
		}
		System.out.println("Element not found");
	}

	static void sort(int arr[])		//Method to sort the array
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])	//Sorting using bubble sort algorithm
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array sorted");
	}
	
	static void display(int arr[])		//Method to display the elements of the array
	{
		System.out.println("Elements in array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
