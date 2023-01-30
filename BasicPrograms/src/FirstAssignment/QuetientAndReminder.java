package FirstAssignment;

public class QuetientAndReminder {

	public static void main(String[] args) {
		System.out.println("Reminder is : "+printReminder(2, 5));
		System.out.println("Quatient is : "+printQuatient(2, 5));
	}
	static double printReminder (double a, double b) {
	double rem=a%b; 
	return rem;
	}
	static double printQuatient (double a, double b) {
	double rem1=a/b;
	return rem1;
	}
	}
//OR

class QuotientAndReminder1{
	public static void main (String [] args) {
	printReminder(25, 6);	
	}
	static void printReminder (int a, int b) {
		int rem=a%b;
		int q=a/b;
		System.out.println("Rem is : "+rem);
		System.out.println("Quotient  is : "+q);
}
}
