package MIxedPracticeSelfExamples;

public class NonStaticMethodOverloading {

	public static void main(String[] args) {
		//System.out.println("Method1: "+Method1);  --> we have to create object of non-static method 
		NonStaticMethodOverloading obj=new NonStaticMethodOverloading();
		System.out.println("Non-Static Method overloading Method1: "+obj.Method1(10));
		System.out.println("Non-Static Method overloading Method2: "+obj.Method1(10, 20));
	}
		int Method1(int a) {
			int res=a*a;
			return res;
		}
		int Method1(int a, int b) {
			int res=a*b;
			return res;
		}
}
