package Overriding;

class Parent5 {
	void show() {
		System.out.println("Parent's show()");
	}
}
class Child5 extends Parent5 {
	// This method overrides show() of Parent
	void show() {
		super.show(); // call show() method of Parent5 class 
		System.out.println("Child's show()");
	}
}
class GrandChild extends Child5 {
	// This method overrides show() of Parent
	void show() {
		super.show(); //call show() method of Child5 class 
		System.out.println("GrandChild's show()");
	}
}
class Overriding9 {
	public static void main(String[] args) {
		Parent5 obj1 = new GrandChild();
		obj1.show();
	}
}