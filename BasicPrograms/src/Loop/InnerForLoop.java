package Loop;

public class InnerForLoop {

	public static void main(String[] args) {
		for (int i=0; i<3; i++) 
		{
				System.out.println("i is: "+i);
			for (int j=0; j<2; j++) 
			{
				System.out.println("\tj is: "+j);
			}
			for (int k=0; k<2; k++) {
				System.out.println("\t\tk is: "+k);
			}
		}
	}

}
