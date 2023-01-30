package UnitoryOperators;

public class ArithmaticOperator{

	public static void main(String[] args) {
		// Variables Definition and Initialization
		int number1 = 13, number2 = 4;
		// Addition Operation
		int res = number1 + number2;
		System.out.println("Sum is: " + res);//
		// Subtraction Operation
		res = number1 - number2;
		System.out.println("Difference is : " + res);//
		// Multiplication Operation
		res = number1 * number2;
		System.out.println("Multiplied value is : " + res);//
		// Division Operation
		res = number1 / number2;
		System.out.println("Quotient is : " + res);//
		// Modulus Operation
		res = number1 % number2;
		System.out.println("Remainder is : " + res);//
	} 
}
class name{
	static int method(){
	int a =20;
	int b=30;
	int res=a+b;
	return res;
	//or
	//return a+b;
	}}
class b{
	public static void main(String[] args) {
		System.out.println(name.method());
//		int res1=name.method();
//		int finalres=100+res1;
//		System.out.println(finalres);
		System.out.println("****OR****");
		int res2=name.method();
		int final2=10+res2;
		System.out.println(final2);
	}
}