package ArrayClass;

import java.lang.reflect.Array;

public class Tushar {

	public static void main(String[] args) {
		int array5[]=new int[5];
		array5[0]=99;
		array5[1]=22;
		array5[2]=1;
		array5[3]=33;
		array5[4]=88;
		for(int a:array5) {
			System.out.print(a);
		}
		System.out.println(Array.getLength(array5));
		System.out.println("*****");
		//to know length of array means number of elements present 
		System.out.println(array5.length);
		System.out.println("*****");
		for(int i=0; i<array5.length; i++) {
		System.out.println(array5[i]);
		System.out.println("*****");	
		System.out.println(Array.get(array5, 3));
		System.out.println("*****");
		//to set any particular element of array
		Array.setInt(array5, 2, 5);
		for(int a:array5) {
			System.out.println(a);
		}
		
		}
	}

}
