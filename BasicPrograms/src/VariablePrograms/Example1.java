package VariablePrograms;

class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Programs Stats");
		//area=pi*r*r
		double r=50;
		double pi=3.14,area;
		area=pi*r*r;
		System.out.println("r= "+r);
		System.out.println("area= "+area);
		System.out.println("**************************");
		area=(22/7)*r*r;                                    //complete no divided by complete no then answer will be a complete no. 22/7 --> 22 is complete no. and 7 is also complete no. then though answer is 3.142857142857143 but java comsider it as complete no and 22/7 = 3. Hence 22/7=3 and 3x50x50 = 7500.
		System.out.println("r= "+r);
		System.out.println("area= "+area); //7500			//complete no divided by complete no answer willbe complete no. 
		System.out.println("**************************");
		area=3.14*r*r;
		System.out.println("r= "+r);
		System.out.println("area= "+area);					//bcz variable area is double datatypes hence though answer 7850 is correct but last ".0" is added by default hence answer becomes 7850.0. 
		System.out.println("**************************");
		area=(22.0/7)*r*r;									//22.0 is not complete no hence after dividing it by 7 answer will not be a complete no. hence 22.0/7 is 7850.14 somethingx 50x50 = 7857.14
		System.out.println("r= "+r);
		System.out.println("area= "+area); 
		System.out.println("Programs Ends");
	}
} 

/*
Complete no divided by complete no answer will be complete no
But one of the no in division is deciminal then answer will be decimal no. 
*/ 