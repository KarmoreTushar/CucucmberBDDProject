package Access;

public class FirstClass {
	private int a=10;	
	int b=20;			
	protected int c=30;
	public int d =40;
	public static void main(String[] args) {
		FirstClass obj=new FirstClass();
		System.out.println("Private a: "+obj.a);
		System.out.println("Default b: "+obj.b);
		System.out.println("Protected c: "+obj.c);
		System.out.println("Public d: "+obj.d);
	}
}

class B{
	public static void main(String[] args) {
		FirstClass obj=new FirstClass();
		//System.out.println("Private a: "+obj.a);
		System.out.println("Default b: "+obj.b);
		System.out.println("Protected c: "+obj.c);
		System.out.println("Public d: "+obj.d);
	}
}