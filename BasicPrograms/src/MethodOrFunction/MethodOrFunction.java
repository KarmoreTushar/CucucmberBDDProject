package MethodOrFunction;

public class MethodOrFunction {

	public static void main(String[] args) {
		System.out.println("*******WAY 1****");
		voidMethod(10);			// here we are unable get return value and hence we are not able to print the return value hence no return value print 	
		voidMethod(20);			
		System.out.println("******Way 2******");
		//two methods to access static method 1. Directly as below
		methodName1(10, 20);	//here we get the return value but we are unable to print the return value and we are not able to use the return value in future
		methodName1(20, 30);	// and also unable to change the value
		//2. with the help of class name 
		//MethodOrFunction.methodName1(15, 20);
		System.out.println("******Way 3*****");
		System.out.println(methodName1(30, 40));	// we are able to get return value and we also able to print return value
		System.out.println(methodName1(50, 60));
		//System.out.println("Return value of methodname1: "+me.res);
		System.out.println("******use of return value in future******");
		int finalAmount=methodName1(40, 50);
		int x=100+finalAmount;
		System.out.println("Final Amount:"+x);
		int y=200+finalAmount;
		System.out.println(y);
		x=200;
		System.out.println(x);
	}
	static void voidMethod(int k) {		//why we write this method as static the reason is “so that we don’t have to make object of such method”
		System.out.println("void method");
		//return; optional if user cannot written it java compiler will written it 
		//void does not return any value 
	}
	static int methodName1(int x, int y) {
	System.out.println("X:"+x);
	System.out.println("Y:"+y);
	int res=x+y;
	return res;
	}}
	






	