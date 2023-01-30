package MethodOrFunction;

public class Method09 {
	static double getInterest(int amount,int noy,float roi) {
		//res=(p*r*t)/100
		System.out.println("Priciple amount is: "+amount);
		System.out.println("Number of years is: "+noy);
		System.out.println("ROI is: "+roi);
		double res=(amount*noy*roi)/100;
		return res;
	}	
	static void displayDetails() {
		System.out.println("I am shailesh");
		System.out.println("Staying in pune");
		System.out.println("Native is UP");
	}
	public static void main(String[] args) {
		//way1: only method is executed but you won;t be able to get its return value so you cannot able to print it
		getInterest(150000, 5, 6.5f);
		System.out.println("*******************************");
		//way2: you won;t be able to use its return value in future 
		System.out.println("Return Value:"+getInterest(150000, 5, 6.5f));
		System.out.println("*******************************");
		//way3: you will be able to get its return value and that can be used in future
		double interestAmount=getInterest(150000, 5, 6.5f);
		System.out.println("Return value: "+interestAmount);
		double futureUse=150000+interestAmount;
		System.out.println("Future use is: "+futureUse);		
	}	
	
}