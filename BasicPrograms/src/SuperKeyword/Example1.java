package SuperKeyword;

class A{
	static int b=66;
	int a=10;
	void Method() {
		int b=33;
		System.out.println("Local Variable b: "+b);//33
		System.out.println("Static global variable b: "+A.b);//66
		int a=50;
		System.out.println("Method 1 a: "+a);//50
		System.out.println("Method 1 a: "+this.a);//10
	}
}
class B extends A{
	static int b=12;
	int a=75;
	void Method() {
		super.Method();	//super keyword --> use to call parent class non-static variable (see line no. 24) or non-static methods.
		int b=102;
		System.out.println("Method 2 a: "+b); //102
		System.out.println("Static global variable b: "+B.b); //12
		System.out.println("Static global variable b: "+A.b); //66
		System.out.println("Method 2 non static global variable a: "+super.a); //10 //super keyword -->call parent class non-static variable
	}
	static void Method1() {
		int a=22;
		System.out.println("Static void method 1: "+a);
		//we cannot use super keyword inside the static method 
	}
	public B() {
		System.out.println("*************class B con calling****************");
		super.Method();
		System.out.println("Con B of B class"+super.a);  
		System.out.println("**********************************************");
	}
}

public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.Method();
		System.out.println("Main method calling: "+A.b);
		System.out.println("Main method calling: "+B.b);
		System.out.println("Object of B class and reference also of B class: "+obj.a);
		System.out.println("Object of B class and reference also of B class: "+B.b);
//		A obj1=new B(); //object of B class reference of A class 
//		System.out.println("Class A a variable: "+obj1.a);
//		A obj2=new A(); //object of A class reference of A class 
//		System.out.println("Class A a variable: "+obj2.a);
//		B obj3=(B)new A(); //object of A class reference of B class--> downcasting should be explicit so we have to write (B)before object creating --> it tells the object A to behave like object class B
//		System.out.println("Class A a variable: "+obj3.a);
	}}
