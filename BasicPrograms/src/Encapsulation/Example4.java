package Encapsulation;
class Demo2{
	private static final int Y = 0;
	private int x=500;
	private int y=1000;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int X) {
		this.x=X;
	}
	public void setY(int Y) {
		this.y=Y;
	}
}
public class Example4 {

	public static void main(String[] args) {
		Demo2 n1=new Demo2();
		System.out.println(n1.getX());
		System.out.println(n1.getY());
		//to update private variables we use setter 
		n1.setX(700);
		n1.setY(900);
		System.out.println(n1.getX());
		System.out.println(n1.getY());
	} 

}

//we can make getter and setter automatically 
//1. right click where we has declared our private members
//2. click on source 
//3. generate getter and setter or only getter or only setter or both