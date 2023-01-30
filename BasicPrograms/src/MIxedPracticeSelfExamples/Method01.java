package MIxedPracticeSelfExamples;

public class Method01 {
	static int MethodOrFunction(int a) {
		int res=a*a;
		System.out.println(a);
		return res;
		}
	public static void main(String[] args) {
		MethodOrFunction(10);
		System.out.println("Main Method Result:"+MethodOrFunction(20));
	}

}
