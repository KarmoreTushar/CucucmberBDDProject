package ArrayPrograms;


//23/11/2022 40:00


class Array512 {
	// creating a method which receives an array as a parameter
	static void min(int arr[]) {//int arr[]=a={ 33, 13, 4, 50,15,1 };
		int min = arr[0];//min=33 | 13 | 4
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {//33>13 |arr[2]=4 -->13>4 |4>50 |4>15| 4>1
				min = arr[i];//min=13
			}
		}
		System.out.println("Min number in array is: "+min);
	}
	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {// 
				max = arr[i];
			}
		}
		System.out.println("Max number in array is: "+max);
	}
}
public class Array51 {
	public static void main(String args[]) {
		int a[] = { 33, 13, 4, 50,15,1};// declaring and initializing an array
		Array512.min(a);// passing array to method
		Array512.max(a);// passing array to method
	}
}