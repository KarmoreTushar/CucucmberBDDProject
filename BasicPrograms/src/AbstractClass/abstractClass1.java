package AbstractClass;

abstract class Bike1 {
	abstract void run();	//it will goes to the run method of Honda4 class as body for this run method is provided in the child class Honda4
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
}
class Honda4 extends Bike1 {
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
} 
class abstractClass1{
	public static void main(String args[]) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1(); //as bike class is abstract we cannot make object for that class 
		Bike1 b2=new Honda4();
		b2.run();
		b2.speed(20);
		//b2.color();	//As reference is of parent class Bike we won't able to access child class member 
		}
}
