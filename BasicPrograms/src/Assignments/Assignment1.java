package Assignments;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("************Area of circle***************");
		System.out.println("Enter R: ");
		int r = scn.nextInt();
		System.out.println("R: " + r);
		double pi = 3.14;
		double area = pi * r * r;
		System.out.println("Area of circle: " + area);
		System.out.println("*********addition, multiplication, substraction***************");
		int add=r+r;
		System.out.println("Addition of two number is: "+add);
		int mul=r*r;
		System.out.println("Multiplication of two number is: "+add);
		int sub=r/r;
		System.out.println("Substraction/Quotient55 of two number is: "+sub);
		System.out.println("************Area of Rectangle*******************");
		System.out.println("Enter w");
		int w = scn.nextInt();
		System.out.println("W: ");
		System.out.println("Enter l");
		int l = scn.nextInt();
		System.out.println("L: ");
		int a = w * l;
		System.out.println("Area of rectangle: " + a);
		System.out.println("***********Quotient and remainder********************");
		System.out.println("Enter divident");
		int dividend=scn.nextInt();
		System.out.println("Dividend is: "+dividend);
		System.out.println("Enter divisor");
		int divisor=scn.nextInt();
		System.out.println("Divisor is: "+divisor);
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("The Quotient is = " + quotient);
		System.out.println("The Remainder is = " + remainder);
		System.out.println("**************fahreheit to celsius*****************");
		System.out.println("Enter fahrenheit");
		float fahrenheit=scn.nextFloat();
		System.out.println("fahrenheit is: "+fahrenheit);
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println("Temperature in celcius is: "+celsius);
		System.out.println("*************celsius to fahreheit******************");
		System.out.println("Enter celsius");
		double celsius1=scn.nextDouble();
		System.out.println("Celsius is: "+celsius1);
		double fahrenheit1 = (celsius1 * 1.8) + 32;
		System.out.println("fahrenheit is: "+celsius1);
		System.out.println("*************Simple interest************");
		System.out.println("Enter principle amount");
		double p=scn.nextDouble();
		System.out.println("Principle amount is: "+p);
		System.out.println("Enter ROI");
		double r1=scn.nextDouble();
		System.out.println("ROI is: "+r1);
		System.out.println("Enter t");
		double t=scn.nextDouble();
		System.out.println("T is: "+t);
		double ar=(p*t*r)/100;
		System.out.println("Simple interest is: "+ar);
	}

}
