package MethodOrFunction;

public class OverloadindMethod {

	public static void main(String[] args) {
		methodOverLoad();								//because this is void return type hence we cannot able to print it
		System.out.println(methodOverLoad(10, 20));
		System.out.println(methodOverLoad(2.5, 100));	//access method directly --> way 1 of accessing method 
		System.out.println(OverloadindMethod.methodOverLoad(10));	//access method with the help of class name.
	}
	public static void methodOverLoad() {
		System.out.println("This is void method with zero parameter");
	}
	public static int methodOverLoad(int x, int y) {
	int res=x+y;
	return res;
}
	public static double methodOverLoad(double k, double l) {
		double res1=k+l;
		return res1;
	}
	public static int methodOverLoad(int m) {
		int res=m+m;
		return res;
	}
}
