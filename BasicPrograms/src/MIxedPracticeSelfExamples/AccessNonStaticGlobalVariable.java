package MIxedPracticeSelfExamples;

public class AccessNonStaticGlobalVariable {
		int a=10;
		static void Method1() {
			int a=20;
			System.out.println("Local variable a of Method 1: "+a);
			//System.out.println("Non-Static global variable a method 2: "+this.a); we cannot use this keyword inside the static method
			AccessNonStaticGlobalVariable n1=new AccessNonStaticGlobalVariable();
			System.out.println("Non-Static global variable a: "+n1.a);
		}
		 void Method2() {
			int a=40;
			System.out.println("Local variable a of Method 2: "+a);
//			AccessNonStaticGlobalVariable n1=new AccessNonStaticGlobalVariable();
//			System.out.println("Non-Static global variable a method 2: "+n1.a);
			System.out.println("Non-Static global variable a method 2: "+this.a);
		 }
		 public AccessNonStaticGlobalVariable() {
			 int a=80;
				System.out.println("Local variable a of constructor: "+a);
//				AccessNonStaticGlobalVariable n1=new AccessNonStaticGlobalVariable();
//				System.out.println("Non-Static global variable a: "+n1.a);
				System.out.println("Non-Static global variable a inside the constructor: "+this.a);
		}
	public static void main(String[] args) {
		//accessing inside the static main method or any static method
		AccessNonStaticGlobalVariable.Method1();
		System.out.println("**********************************");
		int a=60;
		System.out.println("Local variable a of Main method: "+a);
		AccessNonStaticGlobalVariable n2=new AccessNonStaticGlobalVariable();
		System.out.println("Non-Static global variable a: "+n2.a);
		System.out.println("**********************************");
		//accessing non-static method hence have to create object 
		AccessNonStaticGlobalVariable n3=new AccessNonStaticGlobalVariable();
		n3.Method2();
	}

}

//reference variable n1 is present inside the method 1 and 2 but thought methods are different then n1 is different 