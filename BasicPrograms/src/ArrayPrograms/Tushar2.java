package ArrayPrograms;

public class Tushar2 {
	int age;
	Tushar2(){
		System.out.println("Zero param constructor of Tushar2 class");
	}
	Tushar2(int a){
		int age;
		System.out.println("Int param constructor of Tushar2 class");
		this.age=a;
	}
	void method(){
		System.out.println("Method of Tushar2 class");
		System.out.println(age);
	}
	public static void main(String[] args) {
//		Tushar2 obj=new Tushar2();
//		Tushar2 obj1=new Tushar2(10);
//		obj.method();
//		obj1.method();
		
	//datatype[] array_name=new datatype[size];   datatype=class_name --> datatype can be primitive, non-primitive or classes
	  Tushar2[]  obj=new Tushar2[2];
	  obj[0]=new Tushar2();
	  obj[1]=new Tushar2(10);
	  obj[0].method();
	  obj[1].method();
	}

}
