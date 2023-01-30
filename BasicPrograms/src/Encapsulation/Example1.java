package Encapsulation;
class encapProgram {
	private int empID=10;
	private double salary=5000;
	public int getEmpId() {
		return empID; 
	}
	public void setEmpID(int empID) {
		this.empID=empID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
}
public class Example1 {
		
	public static void main(String[] args) {
		encapProgram obj=new encapProgram();
		System.out.println(obj.getEmpId());
		System.out.println(obj.getSalary());
		System.out.println("**************");
		obj.setEmpID(20);
		obj.setSalary(60000);
		System.out.println(obj.getEmpId());
		System.out.println(obj.getSalary());
	}

}
