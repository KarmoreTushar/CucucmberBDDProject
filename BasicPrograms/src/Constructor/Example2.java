package Constructor;

class Example2 {
		int a;
		double b;	
	Example2(int num1, double num2) {
			a=num1;
			b=num2;
		}
	void Display() {
		System.out.println(a+ " " +b);
	}
	public static void main(String[] args) {
		Example2 obj = new Example2(10,10.20);
		obj.Display();
		Example2 obj1 = new Example2(100,20.20);
		obj1.Display();
	}
	
}
