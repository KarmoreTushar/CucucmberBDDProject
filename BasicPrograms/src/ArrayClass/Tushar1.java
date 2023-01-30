package ArrayClass;

import java.lang.reflect.Array;

public class Tushar1 {

	public static void main(String[] args) {
		char array6[]=new char[] {'v','j','u','e'};
		for (char a:array6) {
			System.out.println(a);
		}
		System.out.println("********"); 
		Array.setChar(array6, 1, 'm');
		for (char a:array6) {
			System.out.println(a);
		}
	}

}
