package SingltonClasses;

public class Example3 {
		private Example3() {
			System.out.println("Singleton class");
		}
		static Example3 n1=new Example3();
		static Example3 Method() {
			return n1;
		}
		void Method2() {
			System.out.println("Method 2");
		}
	public static void main(String[] args) {
		Example3 n1=Example3.Method();
		n1.Method2();
	}

}
