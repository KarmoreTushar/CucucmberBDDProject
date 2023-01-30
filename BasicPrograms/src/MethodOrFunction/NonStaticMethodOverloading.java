package MethodOrFunction;

public class NonStaticMethodOverloading {

	public static void main(String[] args) {
	NonStaticMethodOverloading obj1=new NonStaticMethodOverloading();
	System.out.println("Non-Static Method 1 with 1 parameter: "+obj1.Method1(10));
	System.out.println("Non-Static Method 1 with 2 parameter: "+obj1.Method1(10, 20));
	
	//OR
	System.out.println("*************************************");
	NonStaticMethodOverloading obj2=new NonStaticMethodOverloading();
	System.out.println("Non-Static Method 1 with 2 parameter: "+obj2.Method1(10, 20));
	}
	int Method1(int x) {
	int res1=x*x;
	return res1;
	}
	int Method1(int x, int y) {
		int res1=x*y;
		return res1;
		}
}
