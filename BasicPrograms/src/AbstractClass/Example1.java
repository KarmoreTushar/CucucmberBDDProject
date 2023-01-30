package AbstractClass;

abstract class Demo3 {
	int a =10;
	static int b=20;
	abstract void print();//abstract method/incomplete method
	void display() {// normal or non-abstract or concrete method or complete method
		System.out.println("I am a non-abstract method display()..");
	}
	public Demo3() {
		// TODO Auto-generated constructor stub
	}
	static void method() {
		
	}
}
abstract class Demo {
	void display() {
		System.out.println("I am a non-abstract method display()..");
	}
	void display2() {
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo2 {
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class Example1{
	public static void main(String[] args) {
		System.out.println("why");

	}
}
/**
 * class declared with Abstract keyword known as abstract class, 0 to 100% abstract
 * it will have
 * 			- abstract method ----> method declared with abstract keyword without body
 * 			- non-abstract method --> normal method/concrete method
 * 			- constructor
 *  		- static method
 *  		- global variable
 *  Abstract class object can't be create as its incomplete class
 *  
 *  if any class contains even one abstract method dn that class should be declared as abstract class
 *  
 *  when an abstract class is getting inherited by a sub class, dn there will a contract between these classes thats
 *  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes
 *  abstract class
 */ 
