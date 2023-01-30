package ConditionStatement;

public class NestedIf {

	public static void main(String[] args) {
		int age=16;
		int weight=60;
		if (age>=18)  
		{
			System.out.println("Your age is OK ");
				if (weight>=50) 
					{
					System.out.println("Your weight is OK ");
					}	
				else 
					{
					System.out.println("Yor weight is not match");
					}
		}
				System.out.println("Program ends");
		}}
