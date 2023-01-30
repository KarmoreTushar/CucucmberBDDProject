package PyramidPrograms;

public class HalfPyramidAndInvertedPyramid {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {				//for number of rows		/*
			for (int j=1; j<=i; j++) {			//for number of columns			This two for loop is for
				System.out.print("*"+" ");		//								simple pyramid
			}
				System.out.println();			//							*/
			}
		
		
	for (int i=1; i<5; i++) {					//							/*This two for loop is for
		for(int j=4; j>=i; j--) {				//							  inverted pyramid
			System.out.print("*"+" ");
		}
		System.out.println();					//							*/
	}	
}}
