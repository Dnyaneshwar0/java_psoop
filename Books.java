import java.util.Scanner;

public class Books 
{
    double bookRating[][]=new double[4][];

    void input(int n, int ind)
    {
        Scanner k=new Scanner(System.in);
        double rat[]=new double[n];
        System.out.println("Enter "+n+" ratings:");
        for(int i=0;i<n;i++)
        {
            int num=k.nextInt();
            if(num<0 || num>5)
            {
                System.out.println("Invalid value..!!");
                System.exit(0);
            }
            rat[i]=num;
        }
        bookRating[ind]=rat;
    }

    double[] getAvg()
    {
        double ratings[]=new double[4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<bookRating[i].length;j++)
            {
                ratings[i]+=((double)bookRating[i][j]/bookRating.length);
            }
        }
        return ratings;
    }
}
