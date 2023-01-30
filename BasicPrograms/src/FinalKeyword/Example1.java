package FinalKeyword;

public class Example1 {
	//final int speedlimit=70;			-->declaration and initialization at the same time    
	//only in case of non-static global variable we can declare it as above then (instead of initializing it at the same time of declaration we will initialize it by using constructor as below
	final int speedlimit;
	Example1() {
		speedlimit=70;
		System.out.println(speedlimit);
	}
	public static void main(String[] args) {
		Example1 obj = new Example1();
		System.out.println(obj.speedlimit);
		//obj.speedlimit=90;            -->variable speedlimit is final hence it give error
	}

}
