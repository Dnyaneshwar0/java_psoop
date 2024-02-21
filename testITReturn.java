import java.util.Scanner;

class testITReturn
{
	public static void main(String args[])
	{
		ITReturn ob;
		Scanner k=new Scanner(System.in);
		do
		{
			System.out.println("Enter your salary (Professional/Business Income):");
			double sal=k.nextDouble();
			System.out.println("Enter Property Income, Capital Gains and Income from other sources respectively :");
			ob=new ITReturn(sal, k.nextDouble(), k.nextDouble(), k.nextDouble());
			System.out.println("Enter House Rent Allowance (HRA) and Leave Travel Allowance (LTA) if applicable: (Enter 0 if not applicable for each)");
			ob.exempt(k.nextDouble(), k.nextDouble());
			
			System.out.println("Gross Taxable income: "+ob.salary);
			System.out.println("Enter Gender (M/F):");
			char ch=k.next().charAt(0);
			if(ch=='M' || ch=='m')
			{
				if(ob.salary/12>7500 && ob.salary/12<=10000)
				{
					System.out.println("Professional Tax per month: 175");
					ob.salary-=(175*12);
				}
				else if(ob.salary/12>10000)
				{
					System.out.println("Professional Tax per month: 275, and 300 for last month");
					ob.salary-=((275*11)+(300));
				}
				else
				{
					System.out.println("Professional Tax per month: 0");
				}
			}
			else if(ch=='F' || ch=='f')
			{
				if(ob.salary/12>10000)
				{
					System.out.println("Professional Tax per month: 275, and 300 for last month");
					ob.salary-=((275*11)+(300));
				}
				else
				{
					System.out.println("Professional Tax per month: 0");
				}
			}
			
			System.out.println("\nNet taxable Income: "+ob.netTaxIncome());
			
			System.out.println("Net Tax Applicable: "+ob.getTax());
			
			System.out.println("\nEnter 0 to continue:");
		}while(k.nextInt()==0);
	}
}
