class ITReturn
{
	double salary;
	double propInc;
	double capGains;
	double other;
	
	ITReturn(double salary, double propInc, double capGains, double other)
	{
		this.salary=salary;
		this.propInc=propInc;
		this.capGains=capGains;
		this.other=other;
	}
	
	void exempt(double hra, double lta)
	{
		System.out.println("Total exemption from salary: "+(hra+lta));
		this.salary-=(hra+lta);
	}
	
	double netTaxIncome()
	{
		this.salary-=(this.propInc+this.capGains+this.other);
		return this.salary;
	}
	
	double getTax()
	{
		if(this.salary>=250000.0 && this.salary<500000.0)
		{
			return this.salary*5.0/100.0;
		}
		else if(this.salary>=500000.0 && this.salary<1000000.0)
		{
			return this.salary*20.0/100.0;
		}
		else if(this.salary>=1000000.0)
		{
			return this.salary*30.0/100.0;
		}
		return 0;
	}
}
