package Access2;

import Access.FirstClass;

public class AccessDefault extends FirstClass{

	public static void main(String[] args) {
		AccessDefault obj=new AccessDefault();	//as we create child class object we can access protected as well as public variables 
		//System.out.println("Private a: "+obj.a);
		//System.out.println("Default b: "+obj.b);
		System.out.println("Protected c: "+obj.c);
		System.out.println("Public d: "+obj.d);
		//if we use fully qualified class name then we don't want to import, import statement 
		FirstClass obj1=new FirstClass();		//as we create object of parent class we can access only public variable
		//OR --> Access.FirstClass obj1=new Access.FirstClass(); --> Fully qualified class name 
		//System.out.println("Private a: "+obj1.a);
		//System.out.println("Default b: "+obj1.b);
		//System.out.println("Protected c: "+obj1.c);
		System.out.println("Public d: "+obj1.d);   //we can access public members by making parent class as public + importing package 
		Access.FirstClass obj2=new Access.FirstClass(); 
		//System.out.println("Private a: "+obj2.a);
		//System.out.println("Default b: "+obj2.b);
		//System.out.println("Protected c: "+obj2.c);
		System.out.println("Public d: "+obj2.d); 
	}

}
