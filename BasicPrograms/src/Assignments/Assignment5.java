package Assignments;

public class Assignment5 {

	public static void main(String[] args) {
		int arrayPractice[]=new int[5];
		arrayPractice[0]=55;
		arrayPractice[1]=107;
		arrayPractice[2]=12;
		arrayPractice[3]=204;
		arrayPractice[4]=1;
		
		//print the elements one by one
		for (int q: arrayPractice) {			
			System.out.println(q);
		}
		System.out.println("***********");
		//copy all element from one array to another
		int[] rr=arrayPractice.clone();
		for(int g:rr) {
			System.out.println(g);
		}
	}

}
