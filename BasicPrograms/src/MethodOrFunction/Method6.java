package MethodOrFunction;

public class Method6 {

	public static void main(String[] args) {
		areaOfRectangle(4, 3);
		System.out.println("*****************************");
		System.out.println("Area of Rectangle is: "+areaOfRectangle(4, 3));
		System.out.println("*****************************");
		double finalArea =areaOfRectangle(4, 3);
		System.out.println("Final Area is : "+finalArea);
	}
	static double areaOfRectangle(double w, double l) {
	double areaOfRectangle=w*l;
	System.out.println("Width is :"+w);
	System.out.println("Width is :"+l);
	System.out.println("Area of Rectangle is :"+areaOfRectangle);
	return areaOfRectangle;
}
}