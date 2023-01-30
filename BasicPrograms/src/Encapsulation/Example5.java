package Encapsulation;
	class parent {
		private int a=77;
		private int b=99;
		public int getA() {
			return a;
		}
		public int getB() {
			return b;
		}
		public void setA(int A) {
			this.a = A;
		}
		public void setB(int B) {
			this.b=B;
		}
	}
public class Example5 {

	public static void main(String[] args) {
		parent obj=new parent();
//		System.out.println(a); -- cannot accessible directly 
//		System.out.println(b); -- cannot accessible directly
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		obj.setA(200);
		obj.setB(500);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
	}

}
