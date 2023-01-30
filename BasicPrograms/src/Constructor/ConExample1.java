package Constructor;

public class ConExample1 {
	int a;
	int b;
	static int c;
	public ConExample1() {						//user defined constructor 
		a=10;
		b=20;
		c=55;
	}
	public static void main(String[] args) {
		ConExample1 obj=new ConExample1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(ConExample1.c);
	}
}
