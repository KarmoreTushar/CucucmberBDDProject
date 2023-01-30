package MIxedPracticeSelfExamples;

public class VoidMethod {
		static void method1(int a) {
			System.out.println("I am executing void method 1");
			//System.out.println(a);
		}
		double Method2(double a) {
			System.out.println("I am executing void method 2");
			System.out.println(a);
			return a;
		}
	public static void main(String[] args) {
		method1(10);
		VoidMethod obj = new VoidMethod();
		System.out.println(obj.Method2(10.20));
	}

}
