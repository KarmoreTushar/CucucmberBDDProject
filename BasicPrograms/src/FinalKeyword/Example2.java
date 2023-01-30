package FinalKeyword;

 class Example2 {
	int cube(final int n) { //final int n=5
		System.out.println(n);   //n=5
		//n=n+2;   // can't be change as n variable is declared as final
		return n*n*n;
	}
	public static void main(String[] args) {
		Example2 obj= new Example2();
		System.out.println(obj.cube(5));
	}

}
