package InheritancePrograms;


class FirstClass{
	FirstClass(){
		System.out.println("This first class constructor");
	}
	void Method1(){
		System.out.println("This is First Class Method");
	}
}
class SecondClass{
	SecondClass(){
		System.out.println("This Second class constructor");
	}
	void Method2(){
		System.out.println("This is Second Class Method");
	}
}
class ThirdClass{
	ThirdClass(){
		System.out.println("This Third class constructor");
	}
	void Method3(){
		System.out.println("This is First Class Method");
	}
}
public class InheritancePrograms {
	public InheritancePrograms() {
		System.out.println("InheritancePrograms class constructor");
	}
	void Method4(){
		System.out.println("InheritancePrograms class method");
	}
	public static void main(String[] args) {
		FirstClass obj1 = new FirstClass();
		obj1.Method1();
		System.out.println("****************************");
		SecondClass obj2 = new SecondClass();
		obj2.Method2();
		System.out.println("****************************");
		ThirdClass obj3 = new ThirdClass();
		obj3.Method3();
		System.out.println("****************************");
		InheritancePrograms obj4= new InheritancePrograms();
		obj4.Method4();
		System.out.println("*******Insted of making obj for every class we use inheritance see 'Example 1' program*****");
	}

}
