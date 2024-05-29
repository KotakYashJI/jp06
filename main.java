package rectangleandsqure;

public class main
{
	public static void main(String args[])
	{
		rectangle r1 = new rectangle(3.55,4.8);
		sqre sq = new sqre(10);
		
		System.out.println(r1.getarea());
		System.out.println(r1.getperimeter());
		System.out.println(sq.getarea());
		System.out.println(sq.getperimeter());
		System.out.println(r1 instanceof rectangle);
	}
}
