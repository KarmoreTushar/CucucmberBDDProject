package VariablePrograms;

public class Example02 {
	static int a=10;
		   int b=20;
	public static void main(String[] args) {
		int a= 30;
		System.out.println("Local Variable a: "+a);
		System.out.println("Global variable a:"+Example02.a);  //here we use classname to access static global variable. If we don't use class name then it will print local variable value i.e., a=30
		Example02 obj= new Example02();
		System.out.println(obj.b); 
	}

}
