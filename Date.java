public class Date	//class Date to print date and time using overloaded methods
{
	int year, month, date, hrs, min, sec;
	
	public void display()
	{
		System.out.println("Date is:\n"+date+"/"+month+"/"+year+", "+hrs+":"+min+":"+sec);
	}
	
	void setDate(int year, int month, int date) //method to initialise years, months and date 
	{
		this.year=year;
		this.month=month;
		this.date=date;
		this.hrs=0;
		this.min=0;
		this.sec=0;
	}
	void setDate(int year, int month, int date, int hrs, int min)	 //method to initialise years, months, date, hours and minutes
	{
		this.year=year;
		this.month=month;
		this.date=date;
		this.hrs=hrs;
		this.min=min;
		this.sec=0;
	}
	void setDate(int year, int month, int date, int hrs, int min, int sec)	 //method to initialise years, months, date, hours, minutes and seconds
	{
		this.year=year;
		this.month=month;
		this.date=date;
		this.hrs=hrs;
		this.min=min;
		this.sec=sec;
	}
}
