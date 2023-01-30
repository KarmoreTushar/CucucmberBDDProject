package ArrayPrograms;

public class Example123 {

	public static void main(String[] args) {
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		//num[4]=50;  as we comment it, it will give default value thow it is local variable
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		//System.out.println(num[5]); error 
		System.out.println(num.length);
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}for(int a: num) {
			System.out.println(a);
		}
		
	}

}

//way to declare and initialize an array:-
	
//		datatype[] arrayName;								int[] tushar;
//		arrayName=new datatype[size];						tushar=new int[5];

//						OR											OR

//		datatype[] arrayName = new datatype[size];			int tushar=new int[5];

//						OR											OR


//		datatype[] tushar={  ,   ,   ,   };					int[] tushar={10, 20, 30, 40, 50};
