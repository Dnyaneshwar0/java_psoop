import java.util.Scanner;

public class testArrFunc 
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in); //Creating a Scanner object
        System.out.println("Enter number of elements in array:"); 
        int arr[]=new int[k.nextInt()]; 
        do
        {
            System.out.println("Enter choice: \n1. Enter array data \n2. Display data in array \n3. Sort Array \n4. Search for element in array"); 
            byte ch=k.nextByte();
            switch(ch)
            {
                case 1:
                    ArrFunc.input(arr); //Calling the input method in ArrFunc class to fill the array with user input
                break;
                case 2:
                    //display
                    ArrFunc.display(arr); //Calling the display method in ArrFunc class to print the array elements
                break;
                case 3:
                    //sort
                    ArrFunc.sort(arr); //Calling the sort method in ArrFunc class to sort the array in ascending order
                break;
                case 4:
                    //search
                    ArrFunc.search(arr); //Calling the search method in ArrFunc class to search for an element in the array
                break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option."); //Default error statement
            }
            System.out.println("Enter 0 to continue:"); 
        }while(k.nextInt()==0); //Repeating the loop for menu as long as the user enters 0
    }    
}
