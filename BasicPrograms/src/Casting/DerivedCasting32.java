package Casting;

//Base Class
	class JD {
		public void printMe1() {
			System.out.println("JournalDev print method");
		}
		void disp() {
			System.out.println("JournalDev disp method");
		}
	}
	//Inherited class
	class Java extends JD {
		public void printMe2() {
			System.out.println("Java print method");
		}
		void disp() {
			System.out.println("Java disp method");
		}
	}
	//Inherited class
	class Android extends Java {
		public void printMe3() {
			System.out.println("Android print method");
		}
		void disp() {
			System.out.println("Android disp method");
		}
	}
	public class DerivedCasting32 {
		public static void main(String[] args) {		
			JD j1=new Android();//
			j1.printMe1();
			j1.disp();
			System.out.println("************************");
			Java j2=(Java)j1;//
			j2.printMe1();
			j2.printMe2();
			j2.disp();//
			System.out.println("************************");
			Android a1=(Android)j1;//
			a1.printMe1();
			a1.printMe2();
			a1.printMe3();
			a1.disp();	//
			JD h1=(JD)j1;
			h1.printMe1();
			h1.disp();
			JD h11=(Android)j1;
			h11.printMe1();
			h11.disp();
			System.out.println("********************************");
			Android b1=(Android)j1;
			b1.disp();
			b1.printMe1();
			b1.printMe2();
			b1.printMe3();
			System.out.println("///////////////////////////////");
			JD k1=new Android();//up castig 
			k1.disp();
			k1.printMe1();
			Android bb=(Android)k1;
			bb.disp();
			bb.printMe1();
			bb.printMe2();
			bb.printMe3();
		}
	}
