package MIxedPracticeSelfExamples;

public class Demo2 {
		static int a=10;
		int b=77;
		static void Method() {
			int a=20;
			System.out.println(a);//20
			System.out.println(Demo2.a);//10
		}
		void Method1() {
			int a=20;
			System.out.println(a);
			System.out.println(Demo2.a);
			System.out.println(this.b);
		}
		Demo2(){
			System.out.println("Demo 2 zero param cons");
		}
		Demo2(int x, int y){
			int a=55;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println("Demo 2 int-int param cons");
		}
	public static void main(String[] args) {
		Demo2.Method();
		Demo2 o1=new Demo2();
		o1.Method1();
	}

}
	class Demo3 extends Demo2{
			int b=10;
			static void Method2() {
				int b=20000;
				System.out.println(b);//20000
				Demo3 obj1=new Demo3();
				System.out.println(obj1.b);
				//System.out.println("Super keyword: "+super.b);
				Demo2 n1= new Demo2();
				System.out.println("Demo2 NSGV: "+b);
			}
			void Method3() {
				int b=200;
				System.out.println(b);//200
				System.out.println(this.b);//10
				System.out.println("Super keyword: "+super.b);//class Demo2 NSGV 77
			}
			Demo3() {
				this(10);	//this statement			
				System.out.println("Demo3 zero param cons");
			}
			Demo3(int a){
				super();
				int b=33;
				System.out.println(b);//33
				System.out.println(this.b);//10
				System.out.println("Demo3 int param cons");
			}
		public static void main(String[] args) {
			Demo3 obj=new Demo3();
			obj.Method3();
			Demo3.Method2();
			Demo3 obj2=new Demo3(10);
	}
}

//				   inside
//static member 	---> 	static method 		--> 
//												   |-->directly or by class name (if local variable name = static global variable name)
//							non-static method	--> 

//non-static member	--->	static method		--> by creating object 
//							non-static method	--> directly or this keyword - if the name of local varible inside the NS method = NSGV name (use this keyword insted of creating new object)


//this keyword --> this.NSGV_name --> can be use inside a non-static method or constructor --> differentiate local variable and NSGV if name are same of both the variable

//this statement --> this(); --> can be use inside constructor only --> to call another constructor of the same class
	
//super keyword --> super.NS member; --> 
	
//super statement --> Super(); --> can be used inside the child class constructor only --> used to  call parent class constructor based on the parameter passed 
	
	
	
	
	
	
	
	