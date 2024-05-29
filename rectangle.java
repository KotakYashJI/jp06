package rectangleandsqure;

public class rectangle 
{
	private double length;
	private double breadth;
	
	public rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getarea()
	{
		return length*breadth;
	}
	public double getperimeter()
	{
		return 2*(length+breadth);
	}
}
