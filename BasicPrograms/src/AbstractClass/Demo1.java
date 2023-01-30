package AbstractClass;
	interface A1{
		void methodFirst();
		void methodSecond();
	}
	interface A2 {
		void methodFirst();
	}
	abstract class C implements A2{
		public abstract void methodFirst();
	}
	class B implements A1, A2{
		public void methodFirst() { 
			System.out.println("1st method");
		} 
		public void methodSecond(){
			System.out.println("2nd method");
		}
		
	}
public class Demo1 {

	public static void main(String[] args) {
		B n1=new B();
		n1.methodFirst();
		n1.methodSecond();

	}

}
