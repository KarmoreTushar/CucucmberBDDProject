package Scanner;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		String add; 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your address");
		add=scn.nextLine();
		System.out.println("Your address is: "+add);
	}

}
