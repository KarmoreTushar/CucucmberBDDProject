package SingltonClasses;

public class Example4 {
		private Example4() {
			System.out.println("Constructor");
		}
		static Example4 o1=new Example4();
		static Example4 Method() {
			System.out.println("method");
			return o1;
		}
	public static void main(String[] args) {
		Example4 o1= Example4.Method();
	}

}


/**
 * for singleton class
 * 1. class constructor should be private
 * 2. create static instance of current class
 * 3. create static method that will return current class instance(refer step2)
 */