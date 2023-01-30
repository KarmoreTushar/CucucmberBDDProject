package InterfacePrograms;

	//abstract class, interface class, inheritance all concepts in one program
	abstract class Tushar{
		abstract void Method1(); //as abstract method --> has not body
				void Method2() {			//non-abstract method
				System.out.println("Method 2 body");
							}}
		interface Karmore {				
				void Method3(); //by default --> abstract and public 
						}
		interface Haridas { //we cannot interface Haridas extends Tushar --> error-->The type Tushar cannot be a superinterface of Haridas; a superinterface must be an interface
				void Method4(); //by default --> abstract and public 
						}
		interface Haridas2 extends Haridas{
			void Method5();
//			public void Method4() {		we cannot give method body to Method4 as this interface and no method in the interface is with body hence you cannot provide body here to interface Haridas2
//				
//			}
					}
	class child extends Tushar implements Karmore, Haridas, Haridas2{
		public void Method1() {
				System.out.println("Method 1 body in child class");
							}
		public void Method3() {
				System.out.println("Method 3 body");
						}
		public void Method4() {
				System.out.println("Method 4 body");
						}
		public void Method5() {
			System.out.println("Method 5 body");
		}
	}
	class child2 extends Tushar{
		public void Method1() {
		System.out.println("Method 1 of super class body in child2 class");
							}}
	public class AbstractAndInterfaceExample extends child{
	
		public static void main(String[] args) {
			child2 a1=new child2();
			a1.Method1(); //method1 of child 2 class itself
			a1.Method2(); //method2 of Tushar class  
			child a2=new child();
			a2.Method1();
			a2.Method3();
			a2.Method4();
			a2.Method5();
			//we cannot make object of abstract class and interface but we can take a reference of both of them by creating the object of the child class
			System.out.println("********************************");
			Tushar a3=a1; // or Tushar a3=new child2();
			a3.Method1(); //method of tushar class 
			a3.Method2(); //method of tushar class
			System.out.println("********************************");
			Tushar a4=a2;
			a4.Method1(); //TUshar class method1
			a4.Method2(); //TUshar class method1
		}}
 