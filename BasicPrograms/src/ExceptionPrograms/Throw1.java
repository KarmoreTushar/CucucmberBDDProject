package ExceptionPrograms;



 class Throw2 {
	public static void method2(int a, int b) throws ArithmeticException{
		try{int div=a/b;
		}
		catch(ArithmeticException n) {
			
		}
		
			throw new ArithmeticException("Person is not eligible to vote"); 
	}
		public static void method3() {
			System.out.println("Method3");
		}
	public static void main(String[] args)  throws ArithmeticException{
		System.out.println("Main method starts");
//		try{
			Throw2.method2(10,0);
//		}
//		catch(ArithmeticException m) {
//			
//		}
		Throw2.method3();
		System.out.println("Main method ends");
	}

}  