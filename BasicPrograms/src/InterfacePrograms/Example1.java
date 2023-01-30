package InterfacePrograms;

import java.awt.image.ImageProducer;

interface Drawable {
	int age=25;			//by default public static final int age =25;
	void Method1();		//by default public and abstract 
	void Method2();		//by default public and abstract 
}
interface Showable1 extends Drawable{
	int height=22;
	void Method3();
	void Method4();
}
class A implements Showable1, Drawable{
	static int a=55;
	public void Method1() {
		System.out.println("Method 1 overriding");
	}
public void Method2() {
	System.out.println("Method 2 overriding");
	}
public void Method3() {
	System.out.println("Method 3 overriding");
}
public void Method4() {
	System.out.println("Method 4 overriding");
}
}
public class Example1 {

	public static void main(String[] args) {
		A obj=new A();
		obj.Method1();
		obj.Method2();
		obj.Method3();
		obj.Method4();
		System.out.println(Drawable.age);
		System.out.println(A.a);
	}

}
