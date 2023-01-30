package SingltonClasses;
class a{
	private a(){
		System.out.println("a class cons");
	}
	static a obj=new a();
	static a method() {
		System.out.println("method calling");
		return obj;
	}
}
public class Example5 {

	public static void main(String[] args) {
		a n1=a.method();
		a n2=a.method();

	}

}
