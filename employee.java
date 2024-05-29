package javaprograms;

public class employee extends member
{
	private String specialization;
	public employee(String name, String address, String phone, int age, int salary,String specialization) {
		super(name, address, phone, age, salary);
		this.specialization = specialization;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	 
	
}
