package SingltonClasses;

public class Example2 {
	private Example2() {
		System.out.println("I am Example2 class constructor");
	}
	static Example2 obj=new Example2();
	static Example2 Method() {				//default static Example2 Method() { 
		return obj;
	}
	public static void main(String[] args) {
		Example2 obj=Example2.Method();
	}

}
