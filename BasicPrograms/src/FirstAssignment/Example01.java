package FirstAssignment;

public class Example01 {

	public static void main(String[] args) {
	System.out.println("******way 1******");
		addTwoNumber(5, 10);   	//it will only execute the the addTwoNymber method but does not retun any value so here we cannot able to print the res value
	System.out.println("******way 2******");
		addTwoNum(10, 20);		//it will return the res value but we won't able to print its value
		System.out.println("Addition is: "+addTwoNum(10, 30)); //we able to get return value of res and we also able to print its value but we cannot able to use res varibale value in future 
	System.out.println("******way 3 to use res variable value in future******");
		int resValueForFuture=addTwoNum(50, 20);
		int FinalValue=150+resValueForFuture;
		System.out.println("Final Value in future: "+FinalValue);
	}
	static void addTwoNumber(int a, int b) {		//way 1---> where no return value as we declare void as a return type 
		int res=a+b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		//return; --> we don't have to write it Java Compiler will do that for us 
	}
	static int addTwoNum(int a, int b) {		//way 2---> where no return value as we declare void as a retun type 
		int res=a+b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		return res;
}}