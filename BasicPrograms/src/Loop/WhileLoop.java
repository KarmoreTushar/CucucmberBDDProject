package Loop;

public class WhileLoop {

	public static void main(String[] args) {
		int i=5;
		while (i>=0) {
			System.out.println(i);
			i--;
		}
		System.out.println("************");
		int j=0;
		while (j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("*************");
		char c1='a';
		while (c1<='z') {
			System.out.print(c1);
			c1++;
		}
		System.out.println("\n************");		
		int num=0;
		while (num<10) {
			if (num%2==0) {
				System.out.println("Even no is: "+num);
			}
			num++;
		}
		System.out.println();		
		int num1=1;
		while (num1<=10) {
			if (num1%2!=0) {
				System.out.println("Odd no: "+num1);
			}
			num1++;
		}
	}

}
