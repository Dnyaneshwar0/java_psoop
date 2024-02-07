class frac_table
{
	void table(int n)
	{
		Fraction arr[][]=new Fraction[n][n];
		Fraction f=new Fraction();
		for(int i=0;i<n;i++)
		{
			Fraction f1=new Fraction(i,n);
			for(int j=0;j<n;j++)
			{
				if(i==0 && j==0)
				{
					System.out.print("\t");
					continue;
				}
				else if(i==0 || j==0)
				{
					Fraction temp=new Fraction(i+j,n);
					temp.reduce();
					temp.display();
					continue;
				}
				Fraction f2=new Fraction(j,n);
				Fraction prod=new Fraction();
				prod.multiply(f1,f2);
				prod.reduce();
				prod.display();
			}
			System.out.println();
		}
	}
}
