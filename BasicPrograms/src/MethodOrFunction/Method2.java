package MethodOrFunction;

public class Method2 {
	
	public static void main(String[] args) {		
		getAverage();
		getAverage();
		getAverage();
		getAverage(25, 30, 25);
		getAverage(10, 30, 20);
		getAverage(50, 150, 50);
	}
	static void getAverage(int a,int b,int c) {
		int avg;
		avg=(a+b+c)/3;
		System.out.println("Num1: "+a);
		System.out.println("Num2: "+b);
		System.out.println("Num3: "+c);
		System.out.println("Avg: "+avg);
	}
	static void getAverage() {
		int a=10,b=20,c=30,avg;
		avg=(a+b+c)/3;
		System.out.println("Num1: "+a);
		System.out.println("Num2: "+b);
		System.out.println("Num3: "+c);
		System.out.println("Avg: "+avg);
	}
	
}