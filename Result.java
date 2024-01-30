public class Result
{
	String name;
	int id;
	Result(String str, int n)
	{
		name=str;
		id=n;
	}
	
	double calculate(int m1, int m2, int m3, int m4)
	{
		return (double)(m1+m2+m3+m4)/4;
	}
	double calculate(int m1, int m2, int m3, int m4, int m5)
	{
		return (double)(m1+m2+m3+m4+m5)/5;
	}
}
