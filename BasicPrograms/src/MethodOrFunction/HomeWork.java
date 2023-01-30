package MethodOrFunction;

public class HomeWork {
	static double method1(int amount, int noy, int rate) {
		System.out.println("ampunt: "+amount + "\tNumber of yr:"+noy + "\tROI: "+rate);
		int simpleInterest=amount*noy*rate;
		return simpleInterest;
		}
		static double method2(double degreeCelcious) {
		System.out.println("Degree: "+degreeCelcious);	
		double Farenite=(degreeCelcious*1.8)+32;
		return Farenite;
		}
	public static void main(String[] args) {
		double t1=method1(1000, 2, 7);
		System.out.println("Simple Intterest:"+t1);
		System.out.println("*******************************");
		double t2=method2(25);
		System.out.println("farenite: "+t2);
	}
}
