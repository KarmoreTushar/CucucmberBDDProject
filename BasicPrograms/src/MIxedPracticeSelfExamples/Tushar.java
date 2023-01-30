package MIxedPracticeSelfExamples;
class Karmore{
	static int a =20;
	int b=40;
	static void Method1() {
		System.out.println("*************************method1 start********************************");
		int a=60;
		System.out.println("Local variable a of Method1: "+a);//60
		System.out.println("Static global variable a inside Method1: "+Karmore.a);//20
		int b=80;
		System.out.println("Local variable b of method1: "+b);//80
		//System.out.println("Non-static global variable b: "+this.b); because this is static method we cannot able to use this keyword
		Karmore n1=new Karmore(); //call con with zero param
		System.out.println("Non-static global variable b: "+n1.b);
		System.out.println("************************method1 ends*********************************");
	}
	void Method2() {
		System.out.println("*************************method2********************************");
		int a=100;
		System.out.println("Local variable a of method 2: "+a);
		System.out.println("Static global variable a inside methiod 2: "+Karmore.a);
		int b=120;
		System.out.println("Local variable b inside the method 2: "+b);
		//System.out.println("Non-static global variable b: "+n1.b); we cannot call NSGV by using class name --as this is NS method we can call NSGV inside the NS method directly. But as the name of local variable b and NSGV b is same we use this keyword
		System.out.println("Non-static global variable b: "+this.b);
		System.out.println("**************************Method 2 ends *******************************");
	}
	Karmore() {
		this(10); //call another constructor of same class --> call int param constructor of same class 
		System.out.println("**************************con zero param starts*******************************");
		int a=140;
		System.out.println("Local variable a inside the con zero param: "+a);
		System.out.println("Static global variable a inside the con zero param: "+Karmore.a);
		int b=160;
		System.out.println("Local variable b inside the zero param cons: "+b);
		System.out.println("Non-static global variable b inside the zero param con: "+this.b);
		System.out.println("**************************con zero param ends*******************************");
	}
	Karmore(int x) {
		System.out.println("***********************con int param starts**********************************");
		int a=140;
		System.out.println("Local variable a inside the con int param: "+a);
		System.out.println("Static global variable a inside the con int param: "+Karmore.a);
		int b=160;
		System.out.println("Local variable b inside the zero param cons: "+b);
		System.out.println("Non-static global variable b inside the zero param con: "+this.b);
		System.out.println("*************************con int param ends********************************");
	}
	public static void main(String[] args) {
		Karmore.Method1();
		Karmore obj=new Karmore();
		obj.Method2();
	}
}
public class Tushar extends Karmore{
	static int a =200;
	int b=400;
	static void Method1() {
		int a=600;
		System.out.println("Local variable a of class Tushar: "+a);
		System.out.println("Static global variable a of class Tushar: "+Tushar.a);
		System.out.println("Static global variable a of class Karmore: "+Karmore.a);
		int b=808;
		System.out.println("Local variable b of class Tushar: "+b);
		Tushar object=new Tushar();
		System.out.println("Non-static global variable b in class Tushar: "+object.b);
		}
	void Method2() {
		int b=1000;
		System.out.println("Local variable b inside method 2 of class Tushar: "+b);
		System.out.println("*Local variable b inside method 2 of class Tushar: "+super.b);
	}
	Tushar() {
		super(10);
		System.out.println("Constructor of Tushar class");
	}
	public static void main(String[] args) {
		Tushar.Method1();
		Tushar n2=new Tushar();
		n2.Method2();
	}

}
