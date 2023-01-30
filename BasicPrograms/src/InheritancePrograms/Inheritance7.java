package InheritancePrograms;

//parent class
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge); //5
		System.out.println("Fruits fruitAge: "+super.fruitAge);//7		//If any variable or method name of child class or parent class is same then to differentiate between them we use super statement
		taste();		//orange class method							//-	Super() keyword is an instance of immediate parent class 11/11 50.00 --> see SuperStatement in same package	
		super.taste();	//parent class test method
	}
}
public class Inheritance7 {
	public static void main(String[] args) {
		System.out.println("*******************************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************************************");
	}
}

/*
* super: is a keyword or instance of super class
* 			use to refer super class non-static members
* 			mainly used when subclass and super class having common non-static members
*/ 