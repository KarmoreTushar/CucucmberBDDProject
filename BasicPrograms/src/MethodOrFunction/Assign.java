package MethodOrFunction;

public class Assign {
		static double simpleInterest(double a, double rate, int time) {
			System.out.println("Running simple interest method");
			double interest= a*rate*time;
			System.out.println("The amount "+a+"at the rate of "+rate+"for"+time+"years");
			return interest;
		}
			static double degreeToFahrenheit (double degreeCelsius) {
				System.out.println("Running Degree celciuc to fahreneit");
				double res=(degreeCelsius*1.8)+32;
				System.out.println("Degree celciusis equal to: "+degreeCelsius);
				return res;
			}
			static double areaOfCircle(double radius)
			{
				System.out.println("Running area of circle method");
				final double PI=3.14;
				double area=PI*radius*radius;
				System.out.println("For radius: "+radius);
				return area;
			}
	public static void main(String[] args) {
		System.out.println("Program starts");
		double res=simpleInterest(1000, 0.15, 2); //saving simple interest in res variable for future use
		System.out.println("Simple interest is: "+res); 
		System.out.println("*****************************");
		double res1=degreeToFahrenheit(28);
		System.out.println("Fahreneheit is: "+res1);
		System.out.println("********************************");
		double area = areaOfCircle(20);
		System.out.println("Area of circle is : "+area);
		System.out.println("********************************");
		System.out.println("Program ends");
	}

}
