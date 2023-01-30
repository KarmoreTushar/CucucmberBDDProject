package FinalKeyword;

//final keywords only use with non-static global variable
public class Example3 {
		final int x;
		{
			x=10;
			System.out.println("Printing Non-static block");
			System.out.println("Final int variable value now intialize: "+x);
		}
	public static void main(String[] args) {
		Example3 obj = new Example3();
		System.out.println("Final int variable value inside the main method: "+obj.x);
	}
	static {
		System.out.println("Printing static block first before main method starts execution");
	}
}
 