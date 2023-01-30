package Assignments;

import java.util.Scanner;

// to find largest among three numbers 
public class Assignment2_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		if (a >= b && a >= c) {
			System.out.println("Number " + a + " is larger number");
		} else if (b >= a && b >= c) {
			System.out.println("Number " + b + " is larger number");
		} else {
			System.out.println("Number " + c + " is larger number");
		}
	}

}

class tushar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		if (n>0) {
			System.out.println("Given number "+n+" is positive");
		}
		else {
			System.out.println("Given number "+n+" is negative");
		}
	}
}