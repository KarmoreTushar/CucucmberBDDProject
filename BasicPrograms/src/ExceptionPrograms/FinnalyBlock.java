package ExceptionPrograms;

import java.util.Scanner;

public class FinnalyBlock {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str[]=new String[4];
		str [0]=scn.next();
		System.out.println(str[0]);
		str[1]=scn.next();
		System.out.println(str[1]);
		str[2]=scn.next();
		System.out.println(str[2]);
		str[3]=scn.next();
		System.out.println(str[3]);
		try {
			str[4]=scn.next();
			System.out.println(str[4]);
		}
		catch(ArithmeticException a) {		//here ArrayIndexOutOfBoundsException is the exception instead if ArithematicException
			System.out.println("Catch block");
		}
		finally {
			System.out.println("Finally has to execute");
			}
		}

}
