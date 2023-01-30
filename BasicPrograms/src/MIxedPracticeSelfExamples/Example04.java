package MIxedPracticeSelfExamples;

public class Example04 {
		static int a=10;
		int b=70;
		static void Method() {			//static method call with the help of class_name.Method_name();
			int a=50;
			System.out.println("Local variable a: "+a);//50
			System.out.println("Static global variable: "+Example04.a);//10
			int b=90;
			System.out.println("Local variable b :"+b);
			Example04 ob1=new Example04();	//object to load non-static members 
			System.out.println("Non-static global variable :"+ob1.b); 
		}
		void Method1() {	//non-static hence object is created at line no. 31
			System.out.println("Method 1");
			System.out.println("********************************************");
			int a=100;
			System.out.println(a);
			System.out.println(Example04.a);
			//Example04 s1=new Example04();
//			System.out.println("Non-static global variable b: "+s1.b);
//			System.out.println(s1.b);
			System.out.println("Non-static global variable b: "+b);
			
			}
		Example04() {
			int a=600;
			System.out.println("Local variable inside contructor a :"+a);
			System.out.println("Non-static global variable :"+Example04.a);
			int b=55;
			System.out.println("Local Variable b: "+b);
//			Example04 s2=new Example04();
//			System.out.println("Non-static global variable :"+s2.b);  
			// to print non-static global variable in constructor or to differentiate the non-static global variable and local variable when the name of the non-static global variable and local variable is same we use this keyword
			System.out.println("Non-static global variable b: "+this.b);
		}
	public static void main(String[] args) {
		int a=500; 
		System.out.println("Local variable a: "+a);//500
		System.out.println(Example04.a);//10
		System.out.println("*********");
		Example04 a1=new Example04();
		System.out.println("Non-static global variable :"+a1.b);
		System.out.println("*********");
		Example04.Method();
		System.out.println("*********");
		Example04 obj=new Example04();
		obj.Method1();
	
	}}


//Access static global variable