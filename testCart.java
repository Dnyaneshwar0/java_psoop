import java.util.Scanner;

public class testCart 
{
    public static void main(String args[])
    {
        Cart ob=new Cart();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter details of items present:");

        for(int i=0;i<3;i++)    //getting input for all costs
        {
            System.out.println("For Cart "+(i+1)+":");
            for(int j=0;j<2;j++)
            {
                if(j==0)
                {
                    System.out.println("Enter number of Perishable items");
                }
                else
                {
                    System.out.println("Enter number of Non-Perishable items");
                }
                int n=in.nextInt();
                System.out.println("Enter cost of each item:");
                double items[]=new double[n];
                for(int k=0;k<n;k++)
                {
                    items[k]=in.nextDouble();
                }
                ob.carts[i][j]=items;
            }
        }

        do  //menu for all various functions
        {
            System.out.println("Enter choice: \n1. Get Total Cost of items \n2. Get total number of perishable items \n3. Get cost of most expensive items");
            switch(in.nextByte())
            {
                case 1:
                    ob.getCost();
                break;
                case 2:
                    ob.perishNum();
                break;
                case 3:
                    ob.maxCost();
                break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Enter 0 to conitnue");      //default error statement
        }while(in.nextByte()==0);
    }
}
