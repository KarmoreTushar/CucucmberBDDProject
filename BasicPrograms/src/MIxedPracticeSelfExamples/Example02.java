package MIxedPracticeSelfExamples;

public class Example02 {
	static int a=10;
		   int b=20;
	public static void main(String[] args) {
		int a= 30;
		System.out.println("Local Variable a: "+a);
		System.out.println("Global variable a:"+Example02.a); 
		Example02 obj= new Example02();
		System.out.println(obj.b); 
	}

}
