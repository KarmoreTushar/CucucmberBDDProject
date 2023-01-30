package ExceptionPrograms;

import java.util.Scanner;

public class Throw {
	static int x;
	static int y;
		static void method() {
			Scanner d=new Scanner(System.in);
			int x=d.nextInt();
			int y=d.nextInt();
			double div = x / y;
			System.out.println(div);
			throw new ArithmeticException("throw exception");
					}
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a");
		a = scn.nextInt();
		System.out.println("A is: " + a);
		System.out.println("Enter b");
		b = scn.nextInt();
		System.out.println("B is: " + b);
		int sum=a+b;
		System.out.println(sum);
		try{
			Throw.method();
		}
		catch(ArithmeticException o) {
			System.out.println("Exception is handelled");
		}
	}

}
