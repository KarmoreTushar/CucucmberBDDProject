package Constructor;

public class ParaConstructor {
	ParaConstructor() {
		System.out.println("Calling zero para con");
	}
	ParaConstructor(int x){
		System.out.println("Calling int para con");
	}
	ParaConstructor(int x, int y){
		System.out.println("Calling int-int para con");
	}
	ParaConstructor(double x){
		System.out.println("Calling double para con");
	}
	ParaConstructor(double x, int y){
		System.out.println("Calling double-int para con");
	}
	ParaConstructor(char c1){
		System.out.println("Calling char para con");
	}
	public static void main(String[] args) {
		ParaConstructor obj = new ParaConstructor();
		ParaConstructor obj1 = new ParaConstructor(10);
		ParaConstructor obj2 = new ParaConstructor(10,20);
		ParaConstructor obj3 = new ParaConstructor(10.00);
		ParaConstructor obj4 = new ParaConstructor(10.20,10);
		ParaConstructor obj5 = new ParaConstructor('z');
	}

}
