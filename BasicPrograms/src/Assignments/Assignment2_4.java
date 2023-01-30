package Assignments;

import java.util.Scanner;
//to print Tushar Karmore five times
public class Assignment2_4 {

	public static void main(String[] args) {
		String s = "Tushar Karmore";
		int a = 5;
		for (int i = 0; i <= a; i++) {
			System.out.println(s);
		}
	}

}
//to print 5 numbers
class nmk {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scn.nextInt();
		for (int i = 0; i < 5; i++) {
			System.out.println(a);
		}
	}
}

class jkn {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int temp=0, s=scn.nextInt();
		for (int i=1; i<=s;i++) {
			temp=temp+i;
		}
		System.out.println("Sum of 10 natural number is: "+ temp);
	}
}

class rrk{
	public static void main(String[] args) {
		char ch;
 		//printing uppercase alphabets 
		System.out.println("Uppercase alphabets:");
		for(ch='A';ch<='Z';ch++)
			System.out.print(ch + " ");

		//printing new line
		System.out.println("");

		//printing lowercase alphabets 
		System.out.println("Lowercase alphabets:");
		for(ch='a';ch<='z';ch++)
			System.out.print(ch + " ");
	}
	
}










