package MethodOrFunction;

public class Method04 {

	public static void main(String[] args) {
		//Non-Static Method (we have to make object because of that)
		Method04 e1=new Method04();
		//way 1: you won't able to get it's return value and you cannot print it 
		//e1.getInterest(150000, 5, 6.5f);
		System.out.println("***********way one*****************");
		
		//way 2: you won't be able to use it's return value in future
		//System.out.println(e1.getInterest(150000, 5, 6.5f));
		System.out.println("***********way two*****************");
		
		//way 3: you will be able to get its return value and that can be use in future 
		double inetrestAmount=e1.getInterest(150000, 5, 6.5f);
		double FinalAmount=150000+inetrestAmount;
		System.out.println("Final Amount is: "+FinalAmount);
		System.out.println("***********way two*****************");
		e1.displayDetails();
		//System.out.println(e1.displayDetails()); give compile time error because return type of displayDetails method is void hence it won't return any value. 
		}
		double getInterest(int amount, int noy, float f) {
		//res=(p*r*t)/100
		System.out.println("Principle amount is: "+amount);
		System.out.println("Number of years is: "+noy);
		System.out.println("ROI is: "+f);
		double res=(amount*noy*f)/100;
		return res;
	}
		void displayDetails() {
		System.out.println("I am Tushar");
		//Here we don't want to calculate anything. You only wants to display something in console then you have to use void as a return type 
	}}
