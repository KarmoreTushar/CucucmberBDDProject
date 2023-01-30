package MethodOrFunction;

public class HomeWork01 {
	static void Method () {
		System.out.println("This is Tushar");
		System.out.println("Surname is Karmore");
	}
	static int Method1(int a, int b) {
		int res1=a*b;
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
		return res1;
	}
	static int Method2(int a, int b, int c) {
		int res1=a*b*c;
		System.out.println("X is: "+a);
		System.out.println("Y is: "+b);
		System.out.println("Z is: "+c);
		return res1;
	}
	 int Method3(int a, int b, int c, int d) {
		 int res2=a*b+c+d;
		 return res2;
		 }
	void Method4 (char a){
		 System.out.println(a);
	 }
	public static void main(String[] args) {
		System.out.println("Void method only execure method body");   	//as method is void return type so we won't get return value we only execute the method
		Method();
		System.out.println("******Way 1********");			//we able to execute method but won't get return value
		Method1(10, 20);									//Direct way to access method. Here we able to execute method but won't get return value
		System.out.println("Method 1: "+Method1(10, 20));	//Method access with class name - We use class name when we have to access static method of different class 
		System.out.println("*******Way 2***********");		// here we use both method because static method are in same class 
		int v1=Method1(10, 20);
		System.out.println("Store res value in V1 Variable for future use: "+v1); // here we get return value we can use this future value in future by storing its value in a variable (v1)
		int futureUse=150+v1;
		System.out.println("Future use of return value: "+futureUse);
		System.out.println("**************************");
		int v2=Method2(10, 20, 30);
		System.out.println("Return value is: "+v2);
		int FUse=150+v2;
		System.out.println("Future use: "+FUse);
		System.out.println("***********************************");
		HomeWork01 obj=new HomeWork01();
		obj.Method3(10, 50, 60, 55);
		System.out.println("Method 3: "+obj.Method3(10, 25, 35, 45));
		System.out.println("***********************************");
		obj.Method4('t');
		//System.out.println(a);   --> give error as void does not return any value to main method or to JVM hence we are not able to print it in main method
	}
	
}
// we use static method here more than non-static method just to minimize the efforts to create object. The logic of this program can goes with the static or non-staic methods
