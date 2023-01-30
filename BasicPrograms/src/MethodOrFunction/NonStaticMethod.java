package MethodOrFunction;

public class NonStaticMethod {

	public static void main(String[] args) {
		NonStaticMethod Tushar=new NonStaticMethod();     //object creation because method areaOfCircle is non-static
		Tushar.areaOfCircle(3.14,4);	//Way 1																			
		System.out.println("*****************************");
		System.out.println("Area of Circle is: "+Tushar.areaOfCircle(3.14, 4));	//Way 2
		System.out.println("*****************************");
		double area=Tushar.areaOfCircle(3.14, 4);	//Way 3
		double finalArea=8+area;	//future use 
		System.out.println("Total Area of two circles: "+finalArea);
		}
		double areaOfCircle (double pi, double r) {
		double res=pi*r*r;
		System.out.println(pi);
		System.out.println(r);
		return res;
		}
		
	}