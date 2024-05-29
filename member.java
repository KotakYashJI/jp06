package javaprograms;

public class member 
{
	private String name;
	private String address;
	private String phone;
	private int age;
	private int salary;
	
	public member(String name, String address, String phone, int age, int salary) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "member [name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + ", salary="
				+ salary + "]";
	}
	
	
}
