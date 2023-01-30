package SingltonClasses;

class Testing{
	private Testing() {											//1. Private class constructor
		System.out.println("I am Testing class constructor");
	}
	static Testing t1=new Testing();							//2. Static instance of current class
	
	static Testing getInstanceOfTesting() {				//3. create static method that will return current class instance i.e., t1 (refer step2)
		return t1;
	}
	
	void calling() {
		System.out.println("Calling is getting executed");
	}
	
}
public class Example1 {

	public static void main(String[] args) {

//		Testing t1=new Testing();// won't be able to create instance as its constructor is declared as private
//		t1.calling();

		Testing n1=Testing.getInstanceOfTesting();//storing the return value of getInstanceOfTesting(); method in n1 reference variable 
		n1.calling();
		Testing n2=Testing.getInstanceOfTesting();
		n2.calling();

	}

}
/**
 * for singleton class
 * 1. class constructor should be private
 * 2. create static instance of current class
 * 3. create static method that will return current class instance(refer step2)
 */