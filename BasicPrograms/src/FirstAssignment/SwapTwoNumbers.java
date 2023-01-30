package FirstAssignment;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	swapTwoNum(10, 20);	
	}
	static void swapTwoNum(int a, int b) {
	int temp=a+b;
	System.out.println("Initial a is:" +a);
	System.out.println("Initial b is:" +b);
	System.out.println("*****************************");
	a=temp-a;    	//a=30-10=20
	b=temp-b;		//b=30-20=10
	System.out.println("Final a is:" +a);
	System.out.println("Final b is:" +b);
	}
}
