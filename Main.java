import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter choice: \n1.Audi \n2.Ford \n3.Bajaj \n4.TVS");
		switch(k.nextInt())
		{
			case 1:
				Audi audi=new Audi();
				audi.getDetails(k);
                audi.display();
            break;
			case 2:
				Ford ford=new Ford();
				ford.getDetails(k);
                ford.display();
            break;
			case 3:
				Bajaj bajaj=new Bajaj();
				bajaj.getDetails(k);
                bajaj.display();
            break;
			case 4:
				TVS tvs=new TVS();
				tvs.getDetails(k);
                tvs.display();
            break;
            default:
                System.out.println("Invalid Input..!!");
		}
	}
}