package InheritancePrograms;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class Inheritance5 extends A2,B2{
	
	Inheritance5(){
		super();//confusion who is its immediate parent class constructor A2 or B2
	}
	public static void main(String args[]) {
		Inheritance5 obj = new Inheritance5();
		obj.msg();
	}
}
/**
is java supports multiple inheritance or not? ---> Java does not support multiple inheritance using classes 
why java doesn't support multiple inheritance using classes?---> because if ambiguity ---> what is that ambiguity?
Ans--> default super statement inside the base class becomes confuse which one is his immediate parent class default constructor i.e., default constructor of A2 or B2. 
*/