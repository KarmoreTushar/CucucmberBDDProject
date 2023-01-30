package Blocks;
	class Example3{
		static {
			System.out.println("static 1 block class parent");
		}
		{
			System.out.println("non-static 1 block parent class ");
		}
		static {
			System.out.println("static 2 block class parent");
		}
		{
			System.out.println("non-static 2 block parent class ");
		}
		Example3(){
			System.out.println("Parent class con");
		}
	}
public class Example2 extends Example3{
	static {
		System.out.println("static 1 block class sub-class");
	}
	{
		System.out.println("non-static 1 block parent sub-class ");
	}
	static {
		System.out.println("static 2 block class sub-class");
	}
	{
		System.out.println("non-static 2 block parent sub-class ");
	}
	Example2(){
		System.out.println("Sub-class class con");
	}

	public static void main(String[] args) {
		System.out.println("running main method");
		Example2 obj=new Example2();
		System.out.println("****************banta bai muttu*********************");
		Example3 obj1=new Example3();

	}

}
