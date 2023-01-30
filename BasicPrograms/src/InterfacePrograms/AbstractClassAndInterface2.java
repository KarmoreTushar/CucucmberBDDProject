package InterfacePrograms;

	abstract class A1{		//abstract class can have abstract method and non-abstract method 
		abstract void Method();
		void Method1() {
			System.out.println("Abstract class method 1");
		}
	}
		interface A2{
			void Method2();	//by default methods in interface is public hence in class B when we provide body to any method of interface we have to write public as a access modifier to the method which is written in the B class
		}
		interface A3 extends A2{
			void Method3();
		}
	class B extends A1 implements A3{
		public void Method() {
			System.out.println("Method");
		}
		public void Method2() {
			System.out.println("Method 2");
		}
		public void Method3() {
			System.out.println("Method 3");
		}
	}
public class AbstractClassAndInterface2{
	
	public static void main(String[] args) {
		B o1=new B();
		o1.Method();  //of class B
		o1.Method1(); //of class A1
		o1.Method2(); //of class B
		o1.Method3(); //of class B
		A1 o2=o1;
		o2.Method();  //Class A1 Method
		o2.Method1(); //Class A1 Method
	}

}
