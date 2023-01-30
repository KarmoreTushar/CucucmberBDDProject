package InheritancePrograms;

class FirstClass1{
	FirstClass1(){
		System.out.println("This first class constructor");
	}
	void Method1(){
		System.out.println("This is First Class Method");
	}
}
class SecondClass2 extends FirstClass1{
	SecondClass2(){		//SecondClass2(int a){
		System.out.println("This Second class constructor");
	}
	void Method2(){
		System.out.println("This is Second Class Method");
	}
}
class ThirdClass3 extends SecondClass2{
	ThirdClass3(){
		//super();				//because here parent class constructor of this class is zero parameterize constructor hence we don't need to write super() statement 
								// JVM automatically write it but if the parent class constructor of this class is parameterize then we have to explicitly write the super statement and pass the parameter same as the parent class contsructor has paramaters
		//super(10);  --> 		because parent class constructor of this class is parameterized as (int a) we have to write explicitely super statement and based on the parameter of parent class
								//we have to pass parameter in this super statement
		System.out.println("This Third class constructor");
	}
	void Method3(){
		System.out.println("This is third Class Method");
	}
}
public class Example1 extends ThirdClass3 {
	public Example1() {
		System.out.println("Example1 class constructor");
	}
	void Method4(){
		System.out.println("Example1 class method");
	}
	public static void main(String[] args) {
		FirstClass1 obj1 = new FirstClass1();
		obj1.Method1();
		System.out.println("****************************");
		SecondClass2 obj2 = new SecondClass2();
		obj2.Method2();
		System.out.println("****************************");
		ThirdClass3 obj3 = new ThirdClass3();
		obj3.Method3();
		System.out.println("****************************");
		Example1 obj4= new Example1();
		obj4.Method4();
		Example1 object = new Example1();     //---------------------->------------------------------
		object.Method1();															//				|
		object.Method2();															//				|
		object.Method3();															//				|
		object.Method4();															//				|
		System.out.println("****************************");							//				|
		ThirdClass3 ob1 = new ThirdClass3();										//				|
		ob1.Method1();		//Virtual Method/Inherited method										|object of SecondClass and constructor call of Example1 class
		ob1.Method2();		//Virtual Method/Inherited method										|
		ob1.Method3();																//				|
		System.out.println("****************************");							//				|
		FirstClass1 o1 = new FirstClass1();											//				|
		o1.Method1();																//				|
		System.out.println("****************************");							//				|
		SecondClass2 e1= new Example1();	//we can also write this as SecondClass2 e1= object;<---|
		e1.Method1();	//Virtual Method/Inherited method
		e1.Method2();
		System.out.println("*****************************");
		SecondClass2 object1=new Example1();
		System.out.println("*****************************");
		object1.Method1();
		object1.Method2();
		System.out.println("*****************************");
		FirstClass1 t1=obj2;		//Here we use parent class reference i.e., FirstClass1 reference and we cannot access child class members i.e, Method2 we only can access Method1 i.e., FirstCLass1 members 
		t1.Method1();
        //t1.Method2(); --> hideen or not accessible for FirstClass1 
		System.out.println("*****************************");
		FirstClass1 b1=obj4;
		b1.Method1();
//		b1.Method2(); 	--->will not be accessible/hidden to parent class FirstClass1
//		b1.Method3();	--->will not be accessible/hidden to parent class FirstClass1
//		b1.Method4();	--->will not be accessible/hidden to parent class FirstClass1
	}
}
/*
-	super(); java compiler write a default super(), its use to call parent class constructor based on parameter
-	This just like a This() statement
-	Constructor chaining - child class constructor call his immediate parent class constructor and parent class constructor
	call their parent class constructor
-	super statement can be written by the JVM or by the programmer itself
-	here JVM itself write a default constructor 
-	super(); --> super statement should be inside the constructor only
-	like this() statement super statement also should be the first statement inside the constructor
-	Hence, this() and super() cannot write in a constructor at a time 
-	this() statement use to call current class constructor
-	super() statement use to class immediate parent class constructor
-	this () and super() statement both can only be use in a constructor and not anywhere
-	In inheritance only non-static members are participate and not static members 
-	Q. Why this is --> because inheritance is constructor and constructor means object/instance and object means non-static members
-	default constructor then default super() statement -->written by JVM
-	Advantage of inheritance: with the help of child class object we will be able to access all the parent class property without creating new object 
-	Vartual method/inherited method --> those methods of parent class which are inherited in the parent class --> method which is present inside the child class virtually called as virtual method
-	Q. Is java supports Multiple inheritance or not? 
-	Or	Q. Why java doesn't support multiple inheritance? - due to ambiguity java does not support multiple inheritance 11/11 22.00  --ans.: ambiguity is super statement of child class confuse which is his immediate parent class constructor - hence multiple inheritance using classes is not possible in java - we can achieve multiple inheritance in java by using another concept
-	If any variable or method name of child class or parent class is same then to differentiate between them we use super statement
-	Super() keyword is an instance of immediate parent class 11/11 50.00 --> see SuperStatement in same package	
*/
