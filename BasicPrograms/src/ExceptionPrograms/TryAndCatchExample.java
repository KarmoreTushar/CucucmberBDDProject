package ExceptionPrograms;

import java.util.Scanner;

import ArrayPrograms.SampleArray;

public class TryAndCatchExample {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a");
		a=scn.nextInt();
		System.out.println("A is: "+a);
		System.out.println("Enter b");
		b=scn.nextInt();
		System.out.println("B is: "+b);
//		double add=a+b;	//no exception occur here 
//		System.out.println(add);
		try	{
			double div=a/b;
			System.out.println(div);
		}
		catch(ArithmeticException v) {
			System.out.println("Exception catch block");
		}
		System.out.println("Program ends as exception is handled");
		int arr[]=new int[4];
		arr[0]=scn.nextInt();
		arr[1]=scn.nextInt();
		arr[2]=scn.nextInt();
		arr[3]=scn.nextInt();
		try{
			arr[4]=scn.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException q) {
			System.out.println(q);
			q.printStackTrace();
		}
		System.out.println("Exception is handelled now");
		for(int c:arr) {
			System.out.println(c);
		}
	}

}
