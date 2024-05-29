package inheritence;

public class demo extends Childclss
{
	public static void main(String args[]) 
	{
		demo d1 = new demo();
		d1.setState("Gujarat");
		d1.setcity("Ahemdabad");
		System.out.println(d1.getState());
		System.out.println(d1.getcity());
	}
}
