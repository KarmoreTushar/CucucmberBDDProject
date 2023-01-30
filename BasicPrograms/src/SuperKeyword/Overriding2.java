package SuperKeyword;

class Animal2 {
	public void move() {
		int a=10;
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		int a=10;
		System.out.println(a);
		System.out.println("Dogs can walk and run");
		display();
	}
	public void calling() {
		move();					//calling move method of current class to call move method of immediate parent class we use super keyword see line no. 20
//		Animal2 a1=new Animal2();
//		a1.move();
		super.move();		// calling move method of immediate parent class 
		System.out.println("I am calling...");
	}
}
public class Overriding2 {

	public static void main(String args[]) {
		Dog2 b = new Dog2(); // Animal reference but Dog object
		b.calling(); //
	}
}