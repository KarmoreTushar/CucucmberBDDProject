package ThisStatement;

public class ThisStatementExample01 {
			ThisStatementExample01() {
				this (10);
				System.out.println("Zero para cons");
			}
			ThisStatementExample01(int x) {
				this (20,30);
				System.out.println("Int para cons x: "+x);
			}
			ThisStatementExample01(int x, int y) {
				System.out.println("INt-Int para cons x: "+x);
				System.out.println("INt-Int para cons y: "+y);
			}
	public static void main(String[] args) {
//		ThisStatementExample01 obj = new ThisStatementExample01();				instead of creating three objects we can create one object and by -
//		ThisStatementExample01 obj1 = new ThisStatementExample01(10);			using this statement we can call another constructor of the same class 
//		ThisStatementExample01 obj2 = new ThisStatementExample01(20,30);		this statement should be the first statement with the help of parameter we pass in this statement it will call the another constructor of the same class 
		ThisStatementExample01 obj = new ThisStatementExample01();
	}}
//This statement is an instance of current class 
//This statement should be the first statement inside the constructor body
//it is use to call another constructor of the same class based on the parameter we pass
//this statement can only be used inside the constructor 