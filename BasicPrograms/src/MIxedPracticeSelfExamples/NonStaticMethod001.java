package MIxedPracticeSelfExamples;

public class NonStaticMethod001 {
		int Method(int a) {
			int res=a*a;
			System.out.println(a);
			return res;
		}
	public static void main(String[] args) {
		NonStaticMethod001 obj = new NonStaticMethod001();
		System.out.println(obj.Method(10));

	}

} 
