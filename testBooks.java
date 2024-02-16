import java.util.Scanner;

public class testBooks 
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        Books ob=new Books();
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter of number of ratings for Book "+(i+1)+":");
            ob.input(k.nextInt(), i);
        }
        double avgRat[]=ob.getAvg();
        double maxRat[]=new double[2];
        for(int i=0;i<4;i++)
        {
            System.out.println("Average rating for Book "+(i+1)+":"+avgRat[i]);
            if(maxRat[0]<avgRat[i])
            {
                maxRat[0]=avgRat[i];
                maxRat[1]=i+1;
            }
        }
        System.out.println("Maximum average rating is: "+maxRat[0]+" for Book "+maxRat[1]);
    }
}
