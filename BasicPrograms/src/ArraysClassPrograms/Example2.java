package ArraysClassPrograms;

import java.util.Arrays;

public class Example2 {
	static int[] getArray() {
		return new int[] {10,50,7,8,11};
	}
	static int[] b() {
		int[] a={10,50,7,8,11,66};
		return a;
	}

	public static void main(String[] args) {
		int[] age= {10,50,7,8,11};
		System.out.println(Arrays.toString(age));//print array in the string form 
		//to search whether any element is present in an array or not 
		//if element is present the it will return index of that number where it is present 
		System.out.println("elemetn 7 is present on index number: "+Arrays.binarySearch(age, 7));
		System.out.println("******************************************");
		//to search whether any particular index is present in an array in range of array and not in total array
		System.out.println("seach whether 50 is present in array between 0index to 3index: "+Arrays.binarySearch(age, 0, 3, 50));
		System.out.println("******************************************");
		//to update or fill array with particular number (it fill array with particular number with same amount of elements present before fill)
		Arrays.fill(age, 5);
//		for(int a:age) {
//			System.out.println(a);
//		}
		System.out.println(Arrays.toString(age));
		int[] age1= {10,50,7,8,11};
		System.out.println("*************************");
		Arrays.fill(age1, 1, 3, 5);
		System.out.println(Arrays.toString(age1));
		System.out.println("*************************");
		int[] age2= {10,50,7,8,11};
		Arrays.parallelSort(age2);	//sort complete array
		System.out.println(Arrays.toString(age2)); //it will sort array from 0 to 3 index in ascending order
		System.out.println("*************************");
		int[] age3= {10,50,7,8,10,8,7};
		Arrays.parallelSort(age3, 0, 3);
		System.out.println(Arrays.toString(age3)); //it will sort array from 0 to 3 index in ascending order
		System.out.println("*************************");
		Arrays.sort(age3);
		System.out.println(Arrays.toString(age3));
		System.out.println("*************************");
		int[] age4= {10,50,7,8,11,66};
		Arrays.sort(age4);
		System.out.println(Arrays.toString(age4));
		System.out.println("*********callind method*****************");
		int x[]=Example2.getArray();
		System.out.println(Arrays.toString(x));
		int y[]=Example2.b();
		System.out.println(Arrays.toString(y));
	}

}
