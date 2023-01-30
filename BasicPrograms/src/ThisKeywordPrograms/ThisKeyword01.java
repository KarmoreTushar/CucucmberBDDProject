package ThisKeywordPrograms;

class ThisKeyword01 {
	int a=10;			//non-static global variable
	void Method() {
		System.out.println("Local variable a value of Method: "+a);
		System.out.println("Non-Static Global Variable: "+this.a);
	}
	void Method1() {
		int a=100;
		System.out.println("Local variable a value of method 1: "+a);
		System.out.println("Method1 a variable but printing NSGV value:"+this.a);
	}
public static void main(String[] args) {
	int a=50;
	System.out.println("Local Variable a of main method: "+a);
	System.out.println("******way 1 to access non-static global variable a********");
	ThisKeyword01 obj = new ThisKeyword01();
	System.out.println(obj.a);
	System.out.println("******way 2 to access non-static global variable a********");
	obj.Method();
	obj.Method1();
}}

/*
Non-Static GLobal Variable-----
							   |---to access them we have to create one object to load them 
Non-Static method			---			into memory and then by reference of that object we 
										access those NSGV

-	we can directly access NSGV "a" in non-static method or Method1 but we cannot directly access NSGV "a" inside the the 
	main methiod because main method is static method hence we have to use way 1 by creating object and by refering the object we can access NSGV "a" 
	or by using this keyword in a constructor or method (we can use this keyword only inside the constructor or method) and then call those method inside the 
	main method as seen in way 2
*/