package Casting;

class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class UpCasting1 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		UpCasting1 u1=new UpCasting1();//Homogeneous statement  
		u1.myCity();
		Mumbai m1=new UpCasting1();//implicit upcasting 
		m1.Kurla();
		Mumbai m2=u1;//implicit upcasting 
		m2.Deccan(); 
		m2.Kurla();
		Pune p1=new UpCasting1();//implicit upcasting 
		p1.Deccan();
		Pune p2=u1;//implicit upcasting 
		p2.Deccan();
		Mumbai m3=(Mumbai)new UpCasting1();//explicit up casting 
		m3.Deccan();
		m3.Kurla();
		Pune g1=(Pune)new UpCasting1();//explicit up casting 
		g1.Deccan();
		Mumbai m4=(Mumbai)u1;//
		m4.Deccan();
		m4.Kurla();
		Pune p4=(Pune)u1;////explicit up casting 
		Pune p5=new Mumbai();//
		p5.Deccan();
		Pune p6=(Pune)new Mumbai();//
		p6.Deccan();
	}

}