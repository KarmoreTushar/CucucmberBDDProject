package Blocks;

public class Example1 {
		static int a=110;
		static {
			System.out.println("Printing static block 1");
		}
		{
			System.out.println("Printing non-static block1");
		}
	public static void main(String[] args) {
		System.out.println("***************************");
		System.out.println("Main Method Starts");
		System.out.println("Static global variable :"+Example1.a);
		System.out.println("***************************");
		Example1 obj =new Example1();
		System.out.println("***************************");
		Example1 obj2 =new Example1();
	}
	static {
		System.out.println("Printing static block 2");
	}
	{
		System.out.println("Printing non-static block2");
	}
}
/*
Blocks type: 	1. 	Static block:		-	Static with static keyword only and no access modifier, return type, name, parameter 
										- 	it execute before main method starts execution  
				 						-	if we write more then 1 static block in a program then all the static blocks are execute one by one before main methods starts execution
										-	use to give any information --when we start the mobile first logo information come this is example of static 
				
				
				2.	Non-Static block	-	non-static block without static keyword, no access modifier, return type, name, parameter 	
										-	to execute it we have to make object then 
										-	if we write more then 1 non-static block in a program then all the non-static blocks are execute one by one
										-	जितनी बार ऑब्जक्ट् लीखोगे उतनी बार सारे non-static blocks execute होंगे  
										
							IMP	-	as we learn in the use of final keyword that if we declare any non-static global variable as final then the declaration and the initialization of that variable-
									shall be on the same time but we have also learn that we can declare non-static global variable somewhere and initialize it by constructor in same way we can also 
									initialize value of non-static global variable by using non-static block also see Example3 
										
										
Static block or SIB(Static initialization block)
Non-Static block or NSIB (Non-static initialization block)


*/		