package Constructor;

public class ConOverloading01 {
		int age;
		double salary;
		ConOverloading01() {
		System.out.println("Zero para contructor");
			}
		ConOverloading01(int a) {
			System.out.println("Int para contructor");
			age=a;
			}
		ConOverloading01(double b) {
			System.out.println("Double para contructor");
			salary=b;
			}
		ConOverloading01(int a, double b) {
			System.out.println("Int-Double para contructor");
			age=a;
			salary=b;
			}
	public static void main(String[] args) {
		ConOverloading01 obj = new ConOverloading01();
		System.out.println("After zero para con value of a: "+obj.age);
		System.out.println("After zero para con value of b: "+obj.salary);
		ConOverloading01 obj1 = new ConOverloading01(10);
		System.out.println("After Int para con value of a: "+obj1.age); 
		System.out.println("After Int para con value of b: "+obj1.salary);
		ConOverloading01 obj2 = new ConOverloading01(50.00);
		System.out.println("After double para con value of a: "+obj2.age);
		System.out.println("After double para con value of b: "+obj2.salary);
		ConOverloading01 obj3 = new ConOverloading01(100,20.00);
		System.out.println("After int-double para con value of a: "+obj3.age);
		System.out.println("After int-double para con value of b: "+obj3.salary);
	}

}
