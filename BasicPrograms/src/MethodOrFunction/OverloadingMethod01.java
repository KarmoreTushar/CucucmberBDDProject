package MethodOrFunction;

public class OverloadingMethod01 {

	public static void main(String[] args) {
	System.out.println("Method 1 with 1 parameter: "+Method1(10));
	System.out.println("Method 1 with 2 parameter: "+Method1(10, 20));
	}
	static int Method1(int x) {
	int res1=x*x;
	return res1;
	}
	static int Method1(int x, int y) {
	int res1=x*y;
	return res1;
	}
	}
