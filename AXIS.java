class AXIS
{
	double getRateOfInterest(int dur)
	{
		if(dur>7 && dur<=14)
		{
			return 3.15;
		}
		else if(dur>14 && dur<=30)
		{
			return 3.15;
		}
		else if(dur>30 && dur<=45)
		{
			return 3.45;
		}
		else if(dur>45 && dur<=90)
		{
			return 4.05;
		}
		else if(dur>90 && dur<=120)
		{
			return 4.70;
		}
		else if(dur>120 && dur<=180)
		{
			return 5;
		}
		return super.getRateOfInterest(dur);
	}
}
