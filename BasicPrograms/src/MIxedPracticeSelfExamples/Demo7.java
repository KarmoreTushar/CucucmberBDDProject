package MIxedPracticeSelfExamples;
	class Demo6{
		int a=56;
		void Method() {
			int a=66;
			System.out.println("Method 1 of class Demo6");
			System.out.println(a);
			System.out.println(this.a);
			this.Method1();
		}
		Demo6(){
			int a=33;
			System.out.println("Con int param of class Demo6");
			System.out.println(a);
			System.out.println(this.a);
		}
		Demo6(int x){
			int a=22;
			System.out.println("Con int param of class Demo6");
		}
		void Method1() {
		
		}
	}
public class Demo7 {
	int a=44;
	void Method1() {
		int a=88;
		System.out.println("Method 1 of class Demo7");
		System.out.println(a);
		System.out.println(this.a);
		this.Method8();
	}
	public Demo7() {
		this.Method8();
		int a=99;
		System.out.println("Con zero param of class Demo7");
	}
	Demo7(int x){
		int a=49;
		System.out.println("Con int param of class Demo7");
	}
	void Method8() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
