package ArraysClassPrograms;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		int[] stn=new int[5];
		stn[0]=10;
		stn[1]=30;
		stn[2]=50;
		stn[3]=20;
		stn[4]=40;
		System.out.println(Arrays.toString(stn));
		System.out.println(Arrays.binarySearch(stn, 30));
		int stn1[]=Arrays.copyOf(stn, 5);
		System.out.println(Arrays.toString(stn));
		int stn2[]=Arrays.copyOf(stn, 3);
		System.out.println(Arrays.toString(stn2));
		System.out.println(Arrays.equals(stn, stn1));
		System.out.println(Arrays.binarySearch(stn, 1, 3, 50));
		int stn3[]=Arrays.copyOfRange(stn, 1, 3);
		System.out.println(Arrays.toString(stn3));
//		Arrays.fill(stn, 4);
//		System.out.println(Arrays.toString(stn));
//		Arrays.fill(stn, 5);
//		System.out.println(Arrays.toString(stn));
		Arrays.parallelSort(stn);
		System.out.println(Arrays.toString(stn));
		int[] q=new int[7];
		q[0]=70;
		q[1]=60;
		q[2]=50;
		q[3]=20;
		q[4]=40;
		q[5]=30;
		q[6]=10;
		Arrays.parallelSort(q, 2, 6);
		System.out.println(Arrays.toString(q));
		Arrays.sort(q);
		System.out.println(Arrays.toString(q));
	
	}

}
