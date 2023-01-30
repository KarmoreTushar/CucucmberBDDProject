package MIxedPracticeSelfExamples;
class AA {
	AA(){
		System.out.println("Class AA con Zero param");
	}
}
	class B extends AA{
		B(){
			System.out.println("Class B con Zero param");
		}
		B(int a){
			System.out.println("Class B con Int param");
		}
	}
	class C extends B{
		C(){
			super(10);
			System.out.println("Class C con Zero param");
		}
	}
public class ConChaining extends C{

	public static void main(String[] args) {
		C obj=new C();
	}

}
