package FirstAssignment;

public class LeapYear {

	public static void main(String[] args) {
		
		LeapYearOrNot(2021);
		LeapYearOrNot(2022);
	}
	static void LeapYearOrNot(int year) {
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("This year is a leap year :"+year);
	      else
	         System.out.println("This year is not a leap year :"+year);
		
	}
}
