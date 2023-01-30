package ArrayPrograms;

class Array {
	// creating method which returns an array	
	static int[] getArray() {
		
		int num[]=new int[3];
		num[0]=10;
		num[1]=13;
		num[2]=15;
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
		//return num; //or
		return new int[] { 10, 30, 50, 90, 60 };
	}
	static int getNum() {
		//int num=10+31;
		return (10+31);
	}
}
public class Array5 {
	public static void main(String args[]) {
		// calling method which returns an array
		int arr[] = Array.getArray();//{ 10, 30, 50, 90, 60 };
		for(int a: arr) {
			System.out.println(a);
		}
		System.out.println("******");
		// printing the values of an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}