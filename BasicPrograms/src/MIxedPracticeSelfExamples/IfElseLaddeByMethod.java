package MIxedPracticeSelfExamples;

public class IfElseLaddeByMethod {

	public static void main(String[] args) {
		Method('o');
		IfElseLaddeByMethod obj=new IfElseLaddeByMethod();
		System.out.println("Non-Static Method Overloadig: "+obj.Method(10, 20));
	}
	static void Method(char c1) {
		if (c1=='a') {
			System.out.println("c1:a is vowel"); 
		}
		else if (c1=='e') {
			System.out.println("c1:e is vowel");
		}
		else if (c1=='i') {
			System.out.println("c1:i is vowel");
		}
		else if (c1=='o') {
			System.out.println("c1:o is vowel");
		}
		else if (c1=='u') {
			System.out.println("c1:u is vowel");
		}
	}
	int Method(int m, int k) {
		int res=m*k;
		return res;
	}
}
