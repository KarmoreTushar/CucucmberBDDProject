package VariablePrograms;

public class StaticNonStaticVariable {
	static int empId=20;									//static global variable declaration and initialization 
	int empAge=30;											//global variable declaration and initialization
	static char empSex;
	int empSalary;
	public static void main(String[] args) {
		char empName= 'A';									//local variable declaration and initialization 
		long empPin= 0001L;									//local variable declaration and initialization 	
		//int empExp; 
		System.out.println("Datatype char: "+empName);
		System.out.println("Datatype long: "+empPin);
		//System.out.println("Datatype int:"+empExp);      we declare but does not initialize the empExp loval variable hence it gives garbage value which gives error
		System.out.println("******************************");
		empName='B';										//reinitialize the local variable 
		empPin=0002;										//reinitialize the local variable
		System.out.println("Datatype char: "+ empName);
		System.out.println("Datatype long: "+empPin);
		System.out.println("******************************");
		System.out.println("Accessing Static Global Variable by class name:"+StaticNonStaticVariable.empId);
		System.out.println("Accessing Static Global Variable directly:"+empId);		//access static global variable  
		empId=40;
		System.out.println("Updated empId:"+empId);
		System.out.println("******************************");
		System.out.println("Declared but not initialized static global variable:"+empSex); //char default value is blank space
		StaticNonStaticVariable obj= new StaticNonStaticVariable();
		System.out.println("Declared but not initialized non-static global variable:"+obj.empSalary); //int default value is 0
		System.out.println("******************************");
		StaticNonStaticVariable Tushar = new StaticNonStaticVariable();	//object creation to access non-static global variable 
		System.out.println("Non-Static Global Variable:"+Tushar.empAge);
		System.out.println("******************************");
		Tushar.empAge=40;												//reinitialize non-static global variable
		System.out.println("Updated empAge:"+Tushar.empAge);
		System.out.println("******************************");
		StaticNonStaticVariable Tushar1 = new StaticNonStaticVariable();
		System.out.println("New Object create:"+Tushar1.empAge);
		
	}

}
