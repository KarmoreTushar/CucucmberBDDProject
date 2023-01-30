package ThisKeywordPrograms;

public class Thiskeyword03 {
		int a=100;	//Non-Static Global Variable
		Thiskeyword03() {
			int a=100;	//Local variable
			System.out.println("Local Vaiable a inside the constructor: "+a);
			System.out.println("Non-Static Global variable a by usisng constructor: "+this.a); //Printing non-static global variable 
		}
		static void Method33() {
			int a=100;	//Local variable
			System.out.println("Local Vaiable a: "+a);
			//System.out.println("Non-Static Global variable a by using method: "+this.a);   --> eroor
			Thiskeyword03 o1=new Thiskeyword03();
			System.out.println("Non-Static Global variable a by using method: "+o1.a);
		}
	public static void main(String[] args) {
		int a=50;
		System.out.println("Local variable a: "+a);
		Thiskeyword03 obj = new Thiskeyword03();
		obj.Method33();
	}

}
// this keyword use to differentiate the non-static global variable and the local variable if the name of non-static global variable and local-
//variable are same.
//This statement are 