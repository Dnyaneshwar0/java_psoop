class Shipment extends BoxWeight
{
	String source;
	String dest;
	
	void setDetails(String source, String dest)
	{
		this.source=source;
		this.dest=dest;
	}
}
