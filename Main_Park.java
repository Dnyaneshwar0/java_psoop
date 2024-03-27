import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		Imagica img;
		EsselWorld essl;
		
		System.out.println("Enter 'I' for Imagica and 'E' for EsselWorld:");
		char park=k.next().charAt(0);
		if(park=='I')
		{
			img=new Imagica();
		}
		else if(park=='E')
		{
			essl=new EsselWorld();
		}
		System.out.println("Enter number of children and number of adults");
		int chl=k.nextInt();
		int adl=k.nextInt();
		
	}
}
