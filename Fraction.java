import java.util.Scanner;

class Fraction
{
	int num;
	int den;
	
	Fraction()
	{
		num=1;
		den=1;
	}	
	Fraction(int a, int b)
	{
		num=a;
		den=b;
	}	
	
	void display()
	{
		System.out.print(this.num+"/"+this.den+"\t");
	}
	void input()
	{
		Scanner k=new Scanner(System.in);
		System.out.println("Enter Numerator: ");
		this.num=k.nextInt();
		System.out.println("Enter Denominator: ");
		this.den=k.nextInt();
	}
	
	void add(Fraction f1, Fraction f2)
	{
		this.num=(f1.num*f2.den + f1.den*f2.num);
		this.den=(f1.den*f2.den);
	}
	void subtract(Fraction f1, Fraction f2)
	{
		this.num=(f1.num*f2.den - f1.den*f2.num);
		this.den=(f1.den*f2.den);
	}
	void multiply(Fraction f1, Fraction f2)
	{
		this.num=(f1.num*f2.num);
		this.den=(f1.den*f2.den);
	}
	void divide(Fraction f1, Fraction f2)
	{
		this.num=(f1.num*f2.den);
		this.den=(f1.den*f2.num);
	}

	void reduce()
	{
		int max=1;
		for(int i=2;i<=this.den;i++)
		{
			if(this.num%i==0 && this.den%i==0)
			{
				max=i;
			}
		}
		this.num/=max;
		this.den/=max;
	}
}

