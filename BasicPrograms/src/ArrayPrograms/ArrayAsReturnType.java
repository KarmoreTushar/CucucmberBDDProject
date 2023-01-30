package ArrayPrograms;

import java.util.Arrays;

public class ArrayAsReturnType {
	static int[] method() {
		int arr123[]= {55,23,26,256};
		return arr123;
	}
	static void method(int arr[]) {
		for(int as:arr) {
			System.out.println(as);
		}
	}
	public static void main(String[] args) {
		int f[]=ArrayAsReturnType.method();
		for (int d:f) {
			System.out.println(d);
		}
		System.out.println("********");
		int a[]= {6,66,65,89,96};
		ArrayAsReturnType.method(a);
		
	}

}
