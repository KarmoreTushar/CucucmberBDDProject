package SuperStatement;
	class A {
		void Method() {
			System.out.println("This is class A METHOD");
		}
		A() {
			System.out.println("This is class A con");
		}
		A(int a){
			
			System.out.println("This is class A con with int param");
		}
	}
	class B extends A {
		void Method() {
			System.out.println("This is class B METHOD");
		}
		B() {
			this(50); //it call the int para B con of class B 
			//super();  no need to write this as JVM writes it --> because in parent class no parameterized constructor 
			System.out.println("This is class B con");
		}
		B(int v){
			super(10); //call int param con of class A
			System.out.println("*This is class B con with int param");
		}
		
	}
	public class Example1 {
	
	public static void main(String[] args) {
		B obj =new B(); //call class B zero para constructor
		obj.Method();
		B obj1 =new B(10);
		obj1.Method();
	}

}
