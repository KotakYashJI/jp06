package javaprograms;

public class main 
{
	public static void main(String args[])
	{
	employee e1 = new employee("yash","ahemdabad","9173399885",22,25000,"webdev");
	manager m1 = new manager("Pranav","Balasinor","9427733600",21,28000,"it");
	
	System.out.println("Employee salary : "+e1.getSalary());
	System.out.println("Manager salary : "+m1.getSalary());
	System.out.println(e1);
	System.out.println(m1);
	}
}
