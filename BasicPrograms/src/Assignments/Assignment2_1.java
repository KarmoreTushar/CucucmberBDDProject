package Assignments;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
//		char asci='a';
//		int s=(int)asci; //type casting from char to int 
//		System.out.println(s);
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter character");
		char d=scn.next().charAt(0);
		System.out.println("Entered character is: "+d);
		int f=(int)d;
		System.out.println("ASCII value of entered character is: "+f);
		System.out.println("***********swipe two number***********************");
		int x = 100, y = 200;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
		
		
		
		
	}

}
