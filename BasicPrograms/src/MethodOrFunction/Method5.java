package MethodOrFunction;

public class Method5 {

	public static void main(String[] args) {
	areaOfCircle(3.14,4);	//Way 1																			
	System.out.println("*****************************");
	System.out.println("Area of Circle is: "+areaOfCircle(3.14, 4));	//Way 2
	System.out.println("*****************************");
	double area=areaOfCircle(3.14, 4);	//Way 3
	double finalArea=8+area;	//future use 
	System.out.println("Total Area of two circles: "+finalArea);
	}
	static double areaOfCircle (double pi, double r) {
	double res=pi*r*r;
	System.out.println(pi);
	System.out.println(r);
	return res;
	}
	
}
//Method or Function --> It is a set of repetitive statement  
//Way 1 --> Though return value is stored in the method areaofCircle we won't able to print it and same output will shown again and again and you won't able to change value of the variable
			//advantage is no need to write same code again and again

//Way 2 --> We are able to print the return value

//Way 3 --> We can not only print the return value we can also use the return value in future 