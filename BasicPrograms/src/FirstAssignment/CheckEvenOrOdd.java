package FirstAssignment;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
							//int num;
							//System.out.print("Enter an Integer number: ");

	    					//The input provided by user is stored in num
	    					//Scanner input = new Scanner(System.in);
	    					//num = input.nextInt();

	    					// If number is divisible by 2 then it's an even number
							//else it is an odd number
	    					//if ( num % 2 == 0 )
	     					//System.out.println(num+" is an even number.");
							// else
	      					//System.out.println(num+" is an odd number.");
		//int num=0;
		//if (num%2==0) {
			//System.out.println("Number is even");
		//}
		//else {
		//	System.out.println("Number is odd");
		//}
		CheckEvenOddNum(200);
		CheckEvenOddNum(199);
		}
				static void CheckEvenOddNum(int a) {
					if (a%2==0) {
					System.out.println("Number is even :"+a);
						}
					else {
					System.out.println("Number is odd :"+a);
					}
				}
	}

