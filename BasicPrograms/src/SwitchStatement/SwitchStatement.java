package SwitchStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		int value=3;
		switch(value) {
		case 3:
			System.out.println("Case 3 is executed");
		break;   //if we comment this break then at the output it will print case 3 and case 4 then break of case 4
		case 4:
			System.out.println("Case 4 is executed");
		break;
		case 5:
			System.out.println("Case 5 is executed");
		break;
		case 6:
			System.out.println("Case 6 is executed");
		break;
		case 7:
			System.out.println("Case 7 is executed");
		break;
	}

}}
