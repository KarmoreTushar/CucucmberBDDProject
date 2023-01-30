package ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tushar {

	public static void main(String[] args) {
		int[] array1;
		array1=new int[3]; 
		array1[0]=100;
		array1[1]=200;
		array1[2]=300;
		System.out.println("Oth element of array1: "+array1[0]);
		System.out.println("First element of array1: "+array1[1]);
		System.out.println("Second element of array1: "+array1[2]);
		//System.out.println("Third element of array1: "+array1[3]); not possible as we declare only 3 elements in an array1
		System.out.println("Number of elements present: "+array1.length);
		//to print all the elements with the help of for loop 
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]); 
		}
		System.out.println("**************");
		//to print all the elements with the help of for each loop 
		for (int a:array1) {
			System.out.println(a);
		}
		System.out.println("**************"); 
		int[] array2=new int[5];
		array2[0]=500;
		array2[1]=600;
		array2[2]=800;
//		array2[3]=900;
//		array2[4]=1000;
		Arrays.sort(array2);
		for (int a:array2) {
			System.out.println(a);
		}
		
		System.out.println("**************");
		int[] array3= {10,20,30};
		
		System.out.println("**************");
		char[] array4=new char[] {'A','B','C'};
		for (char a:array4) {
			System.out.println(a);
		}
		System.out.println("***********");
		for(char i=0; i<array4.length; i++) {
			System.out.println(array4[i]);
		}
	}
}
 