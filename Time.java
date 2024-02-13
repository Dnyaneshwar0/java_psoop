public class Time		//class Time to print total time in different formats using overloaded functions
{
	public void conversion1(int tsec)		//function to convert total seconds to hours, minutes and seconds and display
	{
		System.out.println("\nHours: "+(tsec/3600));
		tsec%=3600;
		System.out.println("Minutes: "+(tsec/60));
		tsec%=60;
		System.out.println("Seconds: "+tsec);
	}
	
	public void conversion2(int hrs, int mins, int secs)		//function to convert hours, minutes and seconds to total seconds and display
	{
		int tsec=hrs*3600+mins*60+secs;
		System.out.println("Total Seconds: "+tsec);
	}
}
