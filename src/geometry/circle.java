package geometry;

public class circle 
{
	double radius;
	double rad;
	
	public void setarea(double radius)
	{
		this.radius = radius;
	}
	public double getarea()
	{
		return 3.14*radius*radius;
	}
	public void setperimeter(double rad)
	{
		this.rad = rad;
	}
	public double getperimeter()
	{
		return 2*3.14*rad;
	}
}
