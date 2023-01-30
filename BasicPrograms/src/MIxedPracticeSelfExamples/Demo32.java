package MIxedPracticeSelfExamples;
	class Demo4{
		static int a=12;
		int b=223;
		void Method11() {
			System.out.println("Method11 of class Demo4");
		}
		static void Method12() {
			System.out.println("Static method12 of class Demo4");
		}
		Demo4() {
			System.out.println("Zero Con of class Demo4");
		}
		Demo4(int a) {
			System.out.println("Int Con of class Demo4");
		}
	}
public class Demo32 extends Demo4{
			static int a=10; 
			int b=1000;
			void Method() {
				System.out.println(a);
				System.out.println(b);
				int b=45;
				System.out.println(b);
				System.out.println(this.b);
				int a=55;
				System.out.println(this.b);
				this.Method2();
				//3 ways to call method1
				this.Method1(); //not recommended
				Demo32.Method1();
				Method1();
			}
			static void Method1() {
				System.out.println(a);
				Demo32 obj=new Demo32();
				System.out.println(obj.b);
			}
			void Method2() {
				System.out.println("Method2 of class Demo3");
			}
			Demo32() {
				this.Method11(); 
				//this(10); //call int param con of this class 
				System.out.println("Zero Con of class Demo3");
			}
			Demo32(int a) {
				//super.Method11(); //call Method 11 of super class 
				int b=77;
				System.out.println("Local b int con: "+b);
				System.out.println("Super keyword: "+super.b);
				System.out.println("Int Con of class Demo3");
			}
			Demo32(int a, int b){
				super();
				System.out.println("Int int con of class Demo3");
			}
	public static void main(String[] args) {
		Demo32 obj=new Demo32();
		obj.Method();
		Demo32.Method1();
		Demo32 obj1=new Demo32(10, 10);
	}

}
