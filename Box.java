public class Box
{
	double width, height, depth;
	int boxNo;
	
	Box(double w, double h, double d, int num)
	{
		width=w;
		height=h;
		depth=d;
		boxNo=num;
	}
	Box()
	{}
	Box(int num)
	{
		this();
		boxNo=num;
	}
}
