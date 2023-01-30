package MIxedPracticeSelfExamples;

public class Example03 {
		static int a=10;
		int b=20;
		static void Method1() {
			//static method
			int a = 30;
			System.out.println("Local variable a: "+a);
			System.out.println(Example03.a);		// accessing static variable inside the another static method we have to access them by class name
			//System.out.println(b);  ---> error --> as we try to access non-static global variable inside the static method it throws an error  
			System.out.println("*************************************");
			Example03 obj=new Example03();
			//System.out.println(Example03.b);	---> error --> as we try to access non-static global variable inside the static method it throws an error 	
			//System.out.println(this.b);		-->error--> we use following method to acces non-static global variable 
			System.out.println("Accessing non-static global variable b: "+obj.b);
			System.out.println("*************************************");
			
		}
		//non-static method
			void method() {
				Example03 n1=new Example03();
				System.out.println("Non Static Global variable b:"+b);
				System.out.println("Static Global variable a: "+Example03.a);
			}
	public static void main(String[] args) {
		System.out.println("Static Global Variable a:"+a); 						//Way (i)
		System.out.println("Aceessing static global variablea:"+Example03.a);	//Way (ii)
		System.out.println("*************************************");
		Example03.Method1();
		System.out.println("*************************************");
		Example03.Method1();
	}

} 


/*
-	Accessing static global variable to (static) Main Method 		--1)Directly 			-- Way (i)
																	--2)By using class name -- Way (ii)
-	Accessing non-static global variable to (static) Main Method	

-	Accessing static global variable inside the static method like Method1 or main method -> we have to create object and then by refering that object we can access those non-static global variable inside the static method

*/