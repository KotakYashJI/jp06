package javaprograms;

class test
{
	int sub1;
	int sub2;
	void setsum(int sub1,int sub2)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	int getsum()
	{
		return sub1+sub2;
	}
}
public class prog1 {

	public static void main(String[] args) 
	{
		test t1 = new test();
		t1.setsum(10,15);
		System.out.println(t1.getsum());
	}

}
