package StaticNonStaticAccess;


//static global variable   --   local variable 

public class AceessStaticVariables {
		static int a=55;
		static void Method() {
			//Static method
			int a=65;
			int b=75;
			//Access variable a -- local variable name and static global variable name is same 
			System.out.println("Local Variable a: "+a);			//65 Directly but if we want to print static global variable use class name to differentiate local variable and static global variable if both the variable having same name 'a' use below line
			System.out.println("Static Global Variable a: "+AceessStaticVariables.a); //to print it we have to access method inside the main method
			System.out.println("**************************************");
			//if the local variable and static global variable name is different then we can access them by directly or with the help of class name 
			System.out.println("Local Variable b: "+b);									// directly 
			System.out.println("Local Variable b: "+AceessStaticVariables.a);	// by class name 
		}
		void Method1() {
			System.out.println(AceessStaticVariables.a);
		}
	public static void main(String[] args) {
		AceessStaticVariables.Method();
		System.out.println(AceessStaticVariables.a);
	}
}

/*
Static global variable 	(both inside the static method (either static main method or any other static method) for non-static method		=		by	1.	Directly 	--> if local variable and static global variable name are different
																																					2.	Class Name	-->	if the name of local variable and static global variable is - 	(i) 	same
																																																										(ii)	different
 
 */

//
