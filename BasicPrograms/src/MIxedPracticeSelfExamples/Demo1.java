package MIxedPracticeSelfExamples;

public class Demo1 {
		static int a=10;
		int b=20;
		static void Method() {
			int c=30;
			System.out.println(c);
			int a=40;
			System.out.println(a);
			System.out.println(Demo1.a);
			int b=50;
			System.out.println(b);
			Demo1 n1=new Demo1();
			System.out.println(n1.b);
		}
		void Method1() {
			int d=80;
			System.out.println(d);
			int a=60;
			System.out.println(a); 
			System.out.println(Demo1.a);
			int b=70;
			Demo1 n2=new Demo1();
			System.out.println(n2.b);
		}
	public static void main(String[] args) {
		Demo1.Method();
		System.out.println("**********");
		int a=90;
		System.out.println(a);
		System.out.println(Demo1.a);
		System.out.println("**********");
		int b=100;
		System.out.println(b);
		Demo1 obj=new Demo1();
		System.out.println(obj.b);
		System.out.println("**********");
		obj.Method1();
	}

}
