package ArrayClass;

import java.lang.reflect.Array;

public class Example2 {

	public static void main(String[] args) {
		int[] str= new int[3];
		str[0]=10;
		str[1]=20;
		str[2]=30;
		System.out.println(Array.get(str, 2));
		System.out.println(Array.getInt(str, 2));
		System.out.println(Array.getLength(str));
		Array.set(str, 1, 50);
		System.out.println(Array.get(str, 1));
		
	}

}
