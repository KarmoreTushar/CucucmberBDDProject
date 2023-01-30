package FirstAssignment;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		 					//double num1 = -4.5, num2 = 3.9, num3 = 2.5;

	       					// if( num1 >= num2 && num1 >= num3)
	        				//    System.out.println("Num1 is the largest number :"+num1);

	       					// else if (num2 >= num1 && num2 >= num3)
	        				//    System.out.println("Num2 is the largest number :"+num2);

	        				//else
	          				//  System.out.println("Num3 is the largest number:"+num3);
			LargestNumber(15, 5, 70);
	    }
		static void LargestNumber(int a, int b, int c) {
			if (a>=b && a>=c)
				System.out.println("Number a is greater");
			else if (b>=a && b>=c)
				System.out.println("Number b is grater");
			else
				System.out.println("Number c is greater");
		}
	}