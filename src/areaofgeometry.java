import geometry.circle;
import geometry.triangle;
import geometry.rectangle;

public class areaofgeometry 
{
	public static void main(String args[])
	{
		circle c1 = new circle();
		c1.setarea(3.2);
		c1.setperimeter(4.5);
		System.out.println("area of circle : "+c1.getarea());
		System.out.println("perimeter of circle : "+c1.getperimeter());
		
		triangle t1 = new triangle(3.5,4.5);
		t1.setarea(10.5, 2.4);
		t1.setperimeter(1.5, 2.5, 3.5);
		System.out.println("area of triangle : "+t1.getarea());
		System.out.println("perimeter of triangle : "+t1.getperimeter());
		
		rectangle r1 = new rectangle();
		r1.setarea(2.4,5.4);
		r1.setperimeter(10.25, 11.4);
		System.out.println("area of rectangle : "+r1.getarea());
		System.out.println("perimeter of rectangle : "+r1.getperimeter());
	}
}
