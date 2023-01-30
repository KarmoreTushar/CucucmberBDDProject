package Polymorphism;

class Bike {
	int speedlimit = 90;
}
class Honda3 extends Bike {
	int speedlimit = 150;
}
public class Runtime5{
	public static void main(String args[]){  
	  Bike obj=new Honda3();
	  System.out.println(obj.speedlimit);
	}
}
//this is not an example of run time polymorphism as variables cannot participate in overriding 
//only method of overriding of method is possible 