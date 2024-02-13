import java.util.*;

class testFraction
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		Fraction f1=new Fraction();
		Fraction f2=new Fraction();
		do
		{
			System.out.println("Enter choice: \n1.Fraction Multiplication Table \n2.Fraction Calculator");
			int m_ch=k.nextInt();
			if(m_ch==1)		//
			{
				System.out.println("Enter a number:");
				int num=k.nextInt();
				frac_table ft=new frac_table();
				ft.table(num);
			}
			else if(m_ch==2)
			{
		
				Fraction ans=new Fraction();
				int l_ch;
		
				System.out.println("For first Fraction: ");
				f1.input();
				System.out.println("For second Fraction: ");
				f2.input();
				System.out.println("Enter choice: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
				int ch=k.nextInt();
				switch(ch)
				{
					case 1:
						ans.add(f1,f2);
					break;
					case 2:
						ans.subtract(f1,f2);
						break;
					case 3:
						ans.multiply(f1,f2);
					break;
					case 4:
						ans.divide(f1,f2);
					break;
					case 5:
					break;
					default:
						System.out.println("Invalid choice.");
				}
				System.out.print("Answer: ");
				ans.reduce();
				ans.display();
			}
			System.out.println("\nEnter 0 to continue");
		}while(k.nextInt()==0);
	}
}
