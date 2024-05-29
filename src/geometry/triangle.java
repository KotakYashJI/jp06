package geometry;

public class triangle 
{
	double height;
	double base;
	double sight1;
	double sight2;
	double sight3;
	public triangle(double height, double base) 
	{
		this.height = height;
		this.base = base;
	}
	public void setarea(double height,double base)
	{
		this.height = height;
		this.base = base;
	}
	public double getarea()
	{
		return 0.5*height*base;
	}
	public void setperimeter(double sight1,double sight2,double sight3)
	{
		this.sight1 = sight1;
		this.sight2 = sight2;
		this.sight3 = sight3;
	}
	public double getperimeter()
	{
		return sight1+sight2+sight3;
	}
}
