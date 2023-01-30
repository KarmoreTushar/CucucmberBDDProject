package ArraysClassPrograms;

import java.util.Arrays;

import ArrayPrograms.ArrayAsReturnType;

public class CompleteMethodsInArraysClass {

	public static void main(String[] args) {
		int a[]= {6,1,65,7,96};
		int b[]= {12,76,3,5,6};
		System.out.println(Arrays.asList(a));// To convert the elements as List
		int intKey = 89;
		//it will search 89 in the array a
		System.out.println(Arrays.binarySearch(a, 89));
		//or
		System.out.println(intKey+" presntat at index: "+Arrays.binarySearch(a, intKey));
		int c[]=Arrays.copyOf(a, 5);
		for(int j:c) {
			System.out.println(j);
		}
		System.out.println("********");
		int d[]=Arrays.copyOfRange(a, 1, 2); //index 1 is inclusive but index 2 is exclusive means index 2 is ignored
		for(int j:c) {
			System.out.println(j);
		}
		System.out.println(Arrays.equals(a, b));
//		Arrays.fill(b, 8);
//		for(int m:b) {
//			System.out.println(m);
//		}
			System.out.println(Arrays.hashCode(a));
			System.out.println("//////////////");
			Arrays.parallelSort(a);
			System.out.println("Integer Array: "+Arrays.toString(a));
			System.out.println("//////////////");
			Arrays.sort(b);
			System.out.println("Integer Array: "+ Arrays.toString(b));
			System.out.println("---------------------------");
			int p[]= {12,76,3,5,6};
			Arrays.sort(p, 0, 3);
			System.out.println("Integer Array: "+ Arrays.toString(p));
			System.out.println("String p is: "+ Arrays.toString(p));
			
	}

}
