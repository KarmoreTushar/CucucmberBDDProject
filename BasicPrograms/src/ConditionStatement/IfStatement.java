package ConditionStatement;

public class IfStatement {
		static void Method(int num) {
			if (num%2==0){
				System.out.println("Number is even");
				}
				else {
				System.out.println("Number is odd");
				}}
			static boolean Method2(int num1) {
				if (num1%2==0) {
					return true;	
				}
				else {
					return false;
				}}
		
	public static void main(String[] args) {
		int number=55;
		if (number%2==0){
		System.out.println("Number is even");
		}
		else {
		System.out.println("Number is odd");
		}
		Method(15);
		System.out.println("Method 2: "+Method2(20));
	}
}
