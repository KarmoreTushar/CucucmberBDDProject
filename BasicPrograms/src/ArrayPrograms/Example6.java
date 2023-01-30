package ArrayPrograms;
class Print extends Object{	
	int a=10;
	@Override
	public int hashCode() {
		return 101;
	}
	@Override
	public String toString() {
		return "I am Print Class toString";
	}
	@Override
	public boolean equals(Object obj) {//Object obj=p2=new Print();// auto up casting 
		Print p=(Print)obj;//down casting 
		return (this.a==p.a);//compare global variable using this and p which is object of class Print 
			  //10 == 10 
	}	
}
public class Example6{

	static int last_roll = 100;
	int roll_no;
	Example6()
    {
        roll_no = last_roll;
        last_roll++;
    }	
	public static void main(String args[]) {
		
		Example6 s1 = new Example6();
		System.out.println("s: toString of ObjectClass4: "+s1);//
		System.out.println("s: hashCode of ObjectClass4: "+s1.hashCode());//
		System.out.println("***********************************************");
		Example6 s2 = new Example6();
		System.out.println("s2: toString of ObjectClass4: "+s2);//
		System.out.println("s2: hashCode of ObjectClass4: "+s2.hashCode());//
		System.out.println("s1 & s2 compare: "+s1.equals(s2));//
		System.out.println("***********************************************");
		Example6 s3 =s2;  //no new object is created we just give s2 object to s3 (जिस object को  s2 point कर राहा था उसे s3 को  दे दिया )(जिस object को s2 point कर राहा था अब उसे s3 point कर राहा है ) 
		System.out.println("s3 & s2 compare: "+s3.equals(s2));//
		System.out.println("***********************************************");
		Print p1=new Print();
		System.out.println("toString of Print: "+p1);//
		System.out.println("hashCode of Print: "+p1.hashCode());//
		System.out.println("***********************************************");
		Print p2=new Print();
		System.out.println("toString of Print: "+p2);//
		System.out.println("hashCode of Print: "+p2.hashCode());//
		System.out.println("Comparing Print class object p1 & p2 with overriden equals() :"
								+p1.equals(p2));//we pass object reference p2 to override equals method
	}
}
/*
 *  == --->compare two values
 *  d1.equals(d2) --> compare two objects based on there address
 * 
 */
