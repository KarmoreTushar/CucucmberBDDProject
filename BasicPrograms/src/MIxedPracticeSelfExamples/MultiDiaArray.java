package MIxedPracticeSelfExamples;

public class MultiDiaArray {

	public static void main(String[] args) {
		int dn[][] = new int[3][3];	//first[]--> shows row []-->column
//		dn[0][0] = 10;		
//		dn[0][1] = 20;

		System.out.println(dn.length);//gives row count/length
		System.out.println(dn[0].length);//show column count/length
		
		//We cannot use for each loop to print elements one by one 
		//we can use simple for loop or lambda expression
		
		for (int i=0; i<dn.length; i++) {
			for (int j=0; j<dn[i].length;j++) {
				System.out.print(dn[i][j]+" ");
			}
			System.out.println();
		}
		

}
}