package MIxedPracticeSelfExamples;

public class NestedIf {

	public static void main(String[] args) {
		Mehtod(20, 55);
	}
	static void Mehtod (int age, int weight) {
		if (age>=18) {
			System.out.println("Your age is  Ok");
			if (weight>=50) {
				System.out.println("Your weight is  Ok");
			}
		}
		else {
			System.out.println("You are not eligible to donate blood");
		}
	}
}
