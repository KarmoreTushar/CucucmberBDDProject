package MethodOrFunction;

public class Method3 {

	public static void main(String[] args) {
	//way 1: you won't able to get it's return value
	getInterest(150000, 5, 6.5f);			//direct method is called
	System.out.println("***********way one*****************");
	
	//way 2: you won't be able to use it's return value
	System.out.println(getInterest(150000, 5, 6.5f));  //call method in printf statement 
	System.out.println("***********way two*****************");
	
	//way 3: you will be able to get its return value and that can be use in future 
	double inetrestAmount=getInterest(150000, 5, 6.5f);  //we call the method store it's value in any variable then we print it. The advantage is that we we get its return value and we can use it in future.
	double FinalAmount=150000+inetrestAmount;
	System.out.println("Final Amount is: "+FinalAmount);
	
	}
	static double getInterest(int amount, int noy, float f) {
	//res=(p*r*t)/100
	System.out.println("Principle amount is: "+amount);
	System.out.println("Number of years is: "+noy);
	System.out.println("ROI is: "+f);
	double res=(amount*noy*f)/100;
	return res;
}
	static void displayDetails() {
	System.out.println("I am Tushar");
	//Here we don't want to calculate anything. You only wants to display something in console then you have to use void as a return type 
}}

//If we want to do calculation and we wants to use the result of that calculation somewhere in future then we have to define return type (we can give return type as int, float, double, etc).
