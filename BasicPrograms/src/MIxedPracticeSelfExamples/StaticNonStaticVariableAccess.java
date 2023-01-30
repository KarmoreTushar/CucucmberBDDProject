package MIxedPracticeSelfExamples;

public class StaticNonStaticVariableAccess {
		static int a=10;								//static global variable declaration and initialization
		int b=20;										//Non-static global variable declaration and initialization
	public static void main(String[] args) {
		int c=30;										//Local Variable declaration and initialization
		System.out.println("Local Variable: "+c); 		//accessing local variable
		c=40;
		System.out.println("Updated local Variable c: "+c);
		System.out.println("******************************************************");
		System.out.println("Accessing static global variable directly: "+a);
		System.out.println("Accessing static global variable with class name: "+a);
		System.out.println("******************************************************");
		StaticNonStaticVariableAccess obj=new StaticNonStaticVariableAccess();
		System.out.println("Non-Static gloval Variable b: "+obj.b);
		System.out.println("******************************************************");
		obj.b=50;
		System.out.println("Updated Non-Static Global Variable: "+obj.b); 
		System.out.println("******************************************************");
		StaticNonStaticVariableAccess object2=new StaticNonStaticVariableAccess();
		System.out.println("Second object: "+object2.b);
		
	}

}
