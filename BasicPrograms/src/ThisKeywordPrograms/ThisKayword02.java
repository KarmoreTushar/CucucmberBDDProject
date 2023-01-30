package ThisKeywordPrograms;
//this keyword by using constructor
public class ThisKayword02 {
		int a=10;
		ThisKayword02() {
			int a=30;
			System.out.println("Local variable a:" +a); 
			System.out.println("Non-Static Global variable calling by using constructor: "+this.a); //as this method is non-static we use this keyword to differentiate between local variable and NSGV as the name of local variable and NSGV is same
		}
	public static void main(String[] args) {
		int a=20;
		System.out.println("Local variable: "+a);
		ThisKayword02 obj = new ThisKayword02();
		System.out.println("Non-Static Global variable a: "+obj.a);
		//System.out.println("Non-Static Global variable calling by main metho: "+this.a);  --> cannot possible as we access NSGV a in a static method this keyword cannot be used. This is 
		//possible only in non-static method
	}

}
