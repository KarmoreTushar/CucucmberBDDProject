package MIxedPracticeSelfExamples;

public class ThisKeyword01 {
		int a=10;
		void Method() {
			System.out.println("Non-Static Global Variable: "+this.a);
		}
	public static void main(String[] args) {
		int a=50;
		System.out.println("Local Variable a: "+a);
		System.out.println("******way 1 to access non-static global variable a********");
		ThisKeyword01 obj = new ThisKeyword01();
		System.out.println(obj.a);
		System.out.println("******way 2 to access non-static global variable a********");
		obj.Method();
	}

}
