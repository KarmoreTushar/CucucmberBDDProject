package UnitoryOperators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
//Ini --> 	0	  2		 3	  3	--> Total of this gives a final value of b = 0+2+3+3=8
//Final->	1	  2		 3	  3---> Hence 3 is the final value of a
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);// 
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
//Ini -->  -5	  -7	-8	  -8   ---> Total of this gives a final value of b = -5-7-8-8=-28
//Final->  -6	  -7	-8	  -8   ---> Hence -8 is the final value of a	 
		System.out.println("a: "+a);//  
		System.out.println("b: "+b);//  

		a = 21;
		b = --a + --a + --a + a + ++a + a++;
//Ini --> 	20	  19	 18	  18	19	19	---> Total of this gives a final value of b = 20+19+18+18+19+19=113
//Final->	20	  19	 18	  18	19	20 	---> Hence 20 is the final value of a
		System.out.println(a);// 
		System.out.println(b);// 

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
//Ini -->  -2	  -3	-2	  -2   0	 0	  1	---> Total of this gives a final value of b = -2-3-2-2+0+0+1=-8
//Final->  -3	  -3	-2	  -1   0	 1	  1	---> Hence 1 is the final value of a	 
		System.out.println(a);//
		System.out.println(b);//
	}}