package FirstAssignment;

public class Example1 {

	public static void main(String[] args) {
	System.out.println("Addition of two numbers: "+addOfTwoNumbers(2.5, 3.5));
	System.out.println("******************************");
	System.out.println("Multiplication of Two Number :"+multiplyTwoNumber(4, 6));
	System.out.println("******************************");
	addTwoNum(5, 5);
	System.out.println("******************************");
	//System.out.println(addTwoNum(5, 5););  ---> as addTwoNum does not have any return type it won't return any value thats why we cannot print it 
	addTwoNum(10, 20); //it will return the value but we won't be able to print it so we use below method
	System.out.println("Addition of two numbers :"+addTwoNumbers(20, 30));
	}
	static double addOfTwoNumbers(double a, double b) {
	double add=a+b;
	System.out.println("a number is :"+a);
	System.out.println("b number is :"+b);
	return add;
	}
	static double multiplyTwoNumber (float c, float d) {		//we can give return type in this line as float also but float does not stores more than 6 decimal number that's why we use double 
		//if question is to add two float number then we should use datatype float in parameter otherwise we can take double as a datatype
	float res=c*d;
	return res;
	}
	static void addTwoNum (int a, int b) {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		int ans=a+b;
	}
	static int addTwoNumbers (int a, int b) {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		int finalres=a+b;
		return finalres;
}}
