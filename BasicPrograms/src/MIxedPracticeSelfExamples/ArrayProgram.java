package MIxedPracticeSelfExamples;

public class ArrayProgram {

	public static void main(String[] args) {
		int ar[] = new int[5];
		ar[0] = 11;
		ar[1] = 75;
		ar[2] = 4;
		ar[3] = 16;
		ar[4] = 55;
		// ar[5]=31; arrayIndexOutOfBox -- as size is 5 hence we can store in index 0 to
		// 4 =5
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		// or using normal for loop
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("****");
		for (int f:ar) {
			System.out.println(f);
		}
		System.out.println(ar.length);
		// or
		int arr[] = { 11, 75, 4, 16 };
		System.out.println(arr.length);
		// to print the elements one by one using for each loop
		for (int t : arr) {
			System.out.println(t);
		}

	}

}

class Aq{
	Aq(){
		System.out.println("Aq cons");
	}
}

class Bq extends Aq {

}

class Cq extends Bq {

}

class demo extends Cq {
	public static void main(String[] args) {
		Aq[] bb = new Aq[5];
		bb[0] = new Aq();
		bb[1] = new Cq();
		bb[2] = new Bq();
		bb[3] = new Aq();
		bb[4] = new Cq();
		for (Aq g : bb) {
			System.out.println(g);
		}
	}
}






























