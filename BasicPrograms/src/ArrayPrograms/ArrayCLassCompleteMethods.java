package ArrayPrograms;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCLassCompleteMethods {

	public static void main(String[] args) {
		int a[]= {6,66,65,89,96};
		int b[]= {12,76,3,5,6};
		System.out.println(Array.get(a, 3));
		System.out.println(Array.getLength(a));
		System.out.println("******************");
		Array.setInt(a, 3, 41);
		for (int t:a) {
			System.out.println(t);
		}
//		System.out.println("******************");
//		Array.setInt(a, 5, 87); arrayIndexOutOfBox
//		for (int t:a) {
//			System.out.println(t);
//		}
		
	}

}
