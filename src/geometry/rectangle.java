package geometry;

public class rectangle 
{
	double length;
	double width;
	double len;
	double wid;
	
	public void setarea(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	public double getarea()
	{
		return length*width;
	}
	public void setperimeter(double len,double wid)
	{
		this.len = len;
		this.wid = wid;
	}
	public double getperimeter()
	{
		return len+wid;
	}
}
