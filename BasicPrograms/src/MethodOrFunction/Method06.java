package MethodOrFunction;

public class Method06 {

	public static void main(String[] args) {
		averageOfNumbers();
		averageOfNumbers(10, 20, 30);
		averageOfNumbers(20, 30, 50);
		
	}
	static void averageOfNumbers() {
		int num1=10, num2=20, num3=30;
		int res=(num1+num2+num3)/3;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Number3 is: "+num3);
		System.out.println("Result is: "+res);
	}
	
	static void averageOfNumbers(int num1,int num2,int num3) {
		int res=(num1+num2+num3)/3;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Number3 is: "+num3);
		System.out.println("Result is: "+res);
	}


}