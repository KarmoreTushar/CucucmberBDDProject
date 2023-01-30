package FirstAssignment;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int NumOfDigits = 0, num = 123;

	    for (; num != 0; num /= 10, ++NumOfDigits) {
	    }

	    System.out.println("Number of digits is: " + NumOfDigits);
	  }
	}