package MIxedPracticeSelfExamples;

public class StaticMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Method1: "+Method1(10));
		System.out.println("Method2: "+Method1(10, 20));	

	}
		static int Method1(int a) {
			int res1=a*a;
			return res1;
		}
		static int Method1(int a, int b) {
			int res1=a*b;
			return res1;
		}
}
