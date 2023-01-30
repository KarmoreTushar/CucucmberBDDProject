package MIxedPracticeSelfExamples;
	class A{
		int a=10;
		A() { //has default super class cons
			int a=20;
			System.out.println("con of super class");
			System.out.println(a);
			System.out.println(this.a);
		}
		void method() {
			int a=30;
			System.out.println("method of class A");
			System.out.println(a);
			System.out.println(this.a);
		}
		A(double a){
			System.out.println("Double con");
		}
		A(int a, int b){
			this(10.10);
		}
	}
public class ThisSuper extends A {
	ThisSuper() { //default super statement call default super class con
		this(10);
	}
	ThisSuper(int a) {
		//default super statement call default super statement of parent class 
		System.out.println("int con of sub-class");
		this.method();
	}
	ThisSuper(double a) {
		super(10,10);
	}

	public static void main(String[] args) {
		ThisSuper o2=new ThisSuper();
		System.out.println("*******************");
		ThisSuper o3=new ThisSuper(10.20);
	}

}
