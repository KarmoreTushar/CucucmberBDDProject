package StaticNonStaticAccess;

public class NonStaticGlobalVariable {
		int x=500;
		void Method() {
			int x=10;
			System.out.println("Local variable x: "+x);
			System.out.println("Access Global Variable x: "+this.x);
		}
	public static void main(String[] args) {
		//we have create object to load all the non-static members like non-static global variable, non-static method
		NonStaticGlobalVariable object=new NonStaticGlobalVariable();
		object.Method();
		System.out.println("Access global Variable in main method x: "+object.x); 
	}

}
