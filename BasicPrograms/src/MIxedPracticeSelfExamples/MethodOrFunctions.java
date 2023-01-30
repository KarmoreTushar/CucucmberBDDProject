package MIxedPracticeSelfExamples;

public class MethodOrFunctions {
	public static void main(String[] args) {
		Method1();
		//Method2(10, 20);  --> here we are able to execute the method but won't able to print the return value+won't be able to use it in future
		//to print return value use below 
		System.out.println("This way print return value: "+Method2(10, 20)); // though we are able to print the return value but we are not able to use return value in furture
		//To use the return value in future we use below 
		int refVariable=Method2(10, 20);
		int finalAmount=1000+refVariable;
		System.out.println("Final Amount/Way to use return value in future: "+finalAmount);
	}
		static void Method1() {
			System.out.println("This is void method Hence it execute the method but won't get return value");
		}
		static int Method2(int x, int y) {
			int res1=x*y;
			return res1;
		}
}
