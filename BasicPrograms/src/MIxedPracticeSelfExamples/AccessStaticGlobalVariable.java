package MIxedPracticeSelfExamples;

public class AccessStaticGlobalVariable {
		static int b=55;
		 static void Method2() {
		 	int b=75;
		 	System.out.println("Local variable b method 2:"+b);//75
		 	System.out.println("Static Global variable b method 2: "+AccessStaticGlobalVariable.b);//55
		 }
		 	
		 void Method1() {
			 int b=45;
			System.out.println("Method 1 non-static variable: "+b);
			System.out.println("Method 1 static variable: "+AccessStaticGlobalVariable.b);
				 }

		 AccessStaticGlobalVariable() {
			int b=20;
			System.out.println("Constructor local variable b: "+b);
			System.out.println("Contsructor static global variable: "+AccessStaticGlobalVariable.b);
		}
	public static void main(String[] args) {
		int b=99;
		System.out.println("Local variable b main method:"+b);//99
		System.out.println("**************************************");
		AccessStaticGlobalVariable.Method2(); //as method 2 is static we can access it by class name  
		System.out.println("**************************************");
		System.out.println("Local variable b of main method :"+b);
	 	System.out.println("Static Global variable b: "+AccessStaticGlobalVariable.b);
		System.out.println("**************************************");
		AccessStaticGlobalVariable n1=new AccessStaticGlobalVariable();
		System.out.println("**************************************");
		n1.Method1();
	}

}
