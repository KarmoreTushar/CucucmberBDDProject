package FirstAssignment;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		NumberIsPositiveOrNegative(1);
		NumberIsPositiveOrNegative(-1);
	}
	static void NumberIsPositiveOrNegative(int num) {
		if (num>0) {
			System.out.println("Number is positive :"+num);
		}
		else if (num<0) {
			System.out.println("Number is negative :"+num);
		}
		else System.out.println("Number is 0");
	}
}
