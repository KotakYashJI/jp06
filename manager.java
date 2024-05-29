package javaprograms;

public class manager extends member
{
	private String department;
	public manager(String name, String address, String phone, int age, int salary,String department) 
	{
		super(name, address, phone, age, salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "manager [department=" + department + ", getDepartment()=" + getDepartment() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", getAge()=" + getAge()
				+ ", getSalary()=" + getSalary() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
