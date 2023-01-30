package Scanner;

import java.util.Scanner;

public class Example2_1 {
		
	public static void main(String[] args) {
		String name;
		int age;
		char sex;
		double salary;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your Name");
		name=scn.next();
		System.out.println("Your name is: "+name);
		System.out.println("Enter your age");
		age=scn.nextInt();
		System.out.println("Your age is: "+age);
		System.out.println("Enter your Sex");
		sex=scn.next().charAt(0);
		System.out.println("Your sex is: "+sex);
		System.out.println("Enter your slaary");
		salary=scn.nextDouble();
		System.out.println("Your salary is: "+salary);
	}

}
