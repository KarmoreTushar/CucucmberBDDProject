package PyramidPrograms;

public class HalfPyramidUsingNumbers {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" "+j);
			}
				System.out.println();
		}
		System.out.println("-----------");
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" "+i);
			}
				System.out.println();
		}
		System.out.println("-----------");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" "+j);
			}
				System.out.println();
		}
		System.out.println("-----------");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" "+i);
			}
				System.out.println();
		}
		System.out.println("-----------");
		for(char i='a'; i<'f'; i++) {
			for(char j='a'; j<=i; j++) {
				System.out.print(" "+j);
			}
				System.out.println();
		}
		System.out.println("-----------");
		for(char i='a'; i<'f'; i++) {
			for(char j='a'; j<=i; j++) {
				System.out.print(" "+i);
			}
				System.out.println();
		}
	}

}
