package Constructor;

public class ConOverloading02 {
		int empId;
		double	yearOfExp;
		ConOverloading02() {
			System.out.println("zero para constructor");
		}
		ConOverloading02(int a) {
			System.out.println("int para constructor");
			empId=a;
		}
		ConOverloading02(double c1) {
			System.out.println("double para constructor");
			yearOfExp=c1;
		}
		ConOverloading02(int a, int b) {
			System.out.println("int-int-int para constructor");
			empId=a;
			yearOfExp=b;
		}
		ConOverloading02(int a, double b) {
			System.out.println("int-double para constructor");
		}
	public static void main(String[] args) {
		ConOverloading02 obj = new ConOverloading02();
		System.out.println("after zero para con value of empId: "+obj.empId);
		System.out.println("after zero para con value of yearOfExp: "+obj.yearOfExp);
		System.out.println("*******************");
		ConOverloading02 obj1 =new  ConOverloading02(10);
		System.out.println("After int para con value of empId: "+obj1.empId);
		System.out.println("After int para con value of yearOfExp: "+obj1.yearOfExp);
		System.out.println("*******************");
		ConOverloading02 obj2 = new ConOverloading02(10.20);
		System.out.println("After double para con value of empId: "+obj2.empId);
		System.out.println("After double para con value of  yearOfexp: "+obj2.yearOfExp);
		System.out.println("*******************");
		ConOverloading02 obj3 = new ConOverloading02(50, 70);
		System.out.println("After int-int-int para con value of empId: "+obj3.empId);
		System.out.println("After int-int-int para con value of yearOfExp: "+obj3.yearOfExp);	
		System.out.println("*******************");
		ConOverloading02 obj4 = new ConOverloading02(50, 790.546);
		System.out.println("After int-int-int para con value of empId: "+obj4.empId);
		System.out.println("After int-int-int para con value of yearOfExp: "+obj4.yearOfExp);	
	}

}
