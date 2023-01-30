package ArrayPrograms;

public class Example234 {
		int a;
		public Example234() {
			System.out.println("Zero Param Constructor");
		}
		Example234(int a){
			System.out.println("Int Param Constructor");
			this.a=a;
		}
		void method() {
			System.out.println("Display method");
			System.out.println(a);
			
		}
	public static void main(String[] args) {
		Example234 arrayName[]=new Example234[2];
		arrayName[0]=new Example234();
		arrayName[1]=new Example234(10);
		arrayName[0].method();
		arrayName[1].method();
	}

}

