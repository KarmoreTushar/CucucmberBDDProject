package Assignments;

import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
		// to know whether entered number is even or odd
		Scanner scn = new Scanner(System.in);
		System.out.println("Please entered required number");
		int num = scn.nextInt();
		System.out.println("Entered number is: " + num);
		if (num % 2 == 0) {
			System.out.println("Entered number " + num + " is even");
		} else {
			System.out.println("Entered number is odd ");
		}
	}

}
//to check whether a given number is vowel or not using if-else-if ladder

class abc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter character");
		char r = scn.next().charAt(0);
		if (r == 'a') {
			System.out.println("Given character is vowel");
		} else if (r == 'e') {
			System.out.println("Given character is vowel");
		} else if (r == 'i') {
			System.out.println("Given character is vowel");
		} else if (r == 'o') {
			System.out.println("Given character is vowel");
		} else if (r == 'u') {
			System.out.println("Given character is vowel");
		} else {
			System.out.println("Given number is consonent");
		}
	}
}

//to check whether a given number is vowel or not using if-else-if ladder
class abcd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter character");
		char r = scn.next().charAt(0);
		if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
			System.out.println("Given character is vowel");
		} else {
			System.out.println("Given number is consonent");
		}
	}
}