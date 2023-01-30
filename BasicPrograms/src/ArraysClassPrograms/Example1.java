package ArraysClassPrograms;

import java.util.Arrays;

public class Example1 {
	 
	
	public static void main(String[] args) {
		int array1[]=new int[5];
		array1[0]=10;
		array1[1]=99;
		array1[2]=55;
		array1[3]=33;
		array1[4]=11;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		//to get the length of the array 
		System.out.println(array1.length);
		System.out.println("*******");
		//to sort the array1
		Arrays.sort(array1); //it will sort the array and save the sort elements in the same array hence you have to print the same array to get the sorted array
		for(int a:array1) {
			System.out.println(a);
		}
		System.out.println("*******");
		// to copy all the elements of one array into another array
		int a[]=Arrays.copyOf(array1, 7);
		for(int aa:a) {
			System.out.println(aa);
		}
		System.out.println("*******");
		//to copy range from the original array to new array
		int x[]=Arrays.copyOfRange(array1, 0, 5);
		for(int aa:x) {
			System.out.println(aa);
		}
		System.out.println("*******");
		//to compare two arrays 
		System.out.println(Arrays.equals(array1, x));
		System.out.println(Arrays.equals(array1, a));
		System.out.println("*******");
		//to make duplicate array
		int d[]=array1.clone();
		for(int aa:d) {
			System.out.println(aa);
		}
		System.out.println("*******");
	}

}
