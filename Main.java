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
				
		}
	}
}
