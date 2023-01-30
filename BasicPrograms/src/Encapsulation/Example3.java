package Encapsulation;

class ABC{
	private int tushar=101;
	private int karmore=102;
	public int gettushar() {
		return tushar;
	}
	public int getkarmore() {
		return karmore;
	}
	public void settushar(int tushar) {
		this.tushar=tushar;
	}
	public void setkarmore(int karmore) {
		this.karmore=karmore;
	}
}
public class Example3 {
	
	public static void main(String[] args) {
		ABC obj=new ABC();
		System.out.println(obj.gettushar());
		System.out.println(obj.getkarmore());
//		System.out.println(tushar);
//		System.out.println(karmore);
		obj.settushar(103);
		obj.setkarmore(104);
		System.out.println(obj.gettushar());
		System.out.println(obj.getkarmore());
	}

}
