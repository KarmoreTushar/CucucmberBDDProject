package ConditionStatement;

public class IfElseLadder01 {

	public static void main(String[] args) {
		int num=50;
		if (num<60) {
			System.out.println("Geade D");
		}
		else if ((num>=60) && (num<=70)){
			System.out.println("Grade C");
		}
		else if ((num>=70) && (num<=80)) {
			System.out.println("Grade B");
		}
		else if (num>=80) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("You are absent");
		}
	}

}
