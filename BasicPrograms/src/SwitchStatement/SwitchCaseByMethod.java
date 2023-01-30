package SwitchStatement;

public class SwitchCaseByMethod {

	public static void main(String[] args) {
		Method(10, 20, '+');
		Method(20, 30, '-');

	}
	static void Method(int a, int b, int op) {
		int res;
		switch(op) {
		case '-':
			res=a-b;
			System.out.println("a-b: "+res);
			break;
		case '/':
			res=a/b;
			System.out.println("a/b: "+res);
			break;
		case '+':
			res=a+b;
			System.out.println("a+b: "+res);
			break;
		}
	}
}
