package VariablePrograms;

public class StaticNonStatic {
	static int rollNo= 100;
	int studentId= 11;
	public static void main(String[] args) {
	char studentSex='M';									//declaration and initialization of local variable
	System.out.println("Local variable: "+studentSex);   	//accessing local variable
	studentSex='F';
	System.out.println("Updated local variable: "+studentSex);
	StaticNonStatic obj=new StaticNonStatic();
	System.out.println("non-static/instance variable:"+obj.studentId);
	obj.studentId=22;
	System.out.println("updated non-static/instance variable:"+obj.studentId);
	StaticNonStatic obj2=new StaticNonStatic();
	System.out.println("New object: "+obj2.studentId);
	System.out.println("Static GLobal Variable: "+rollNo);					//accessing non-static global variable directly
	System.out.println("Static GLobal Variable: "+StaticNonStatic.rollNo);	//accessing non-static global variable by using class name
	
	}

}
