package Encapsulation;
class encapExample{
	private int rollno=101;
	private double percentage=60;
	public int getrollno() {
		return rollno;
	}
	public void setrollno(int rollno) {
		this.rollno=rollno;		
	}
	public double percentage() {
		return percentage;
	}
	public void setpercentage(double percentage) {
		this.percentage=percentage;
	}
}
public class Example2 {

	public static void main(String[] args) {
	encapExample n1=new encapExample();
	System.out.println(n1.getrollno());
	System.out.println(n1.percentage());
	n1.setrollno(102);
	n1.setpercentage(85);
	System.out.println(n1.getrollno());
	System.out.println(n1.percentage());
	}

}
