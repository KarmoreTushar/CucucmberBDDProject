package ConditionStatement;

public class LeapYear {

	public static void main(String[] args) {
		int year=2022;
		if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("Year is leap year");
		
	}
		else {
			System.out.println("Year is not leap year");
		}
		System.out.println("**********************************");
		System.out.println(Method(2022));	
		System.out.println("**********************************");
		System.out.println(Method(1988));
	}
		static boolean Method(int year) {
			if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
				return true;
			}
			else {
				return false; 
			}
		}
		static void Method1(int num) {
			if ((num%4==0)&&(num%100!=0)||(num%400==0)) {
				System.out.println("Year is leap year");
			
		}
			else {
				System.out.println("Year is not leap year");
			}
		}
	}
