package SystemClassPrograms;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("System user directory: "+System.getProperty("user.home"));
		System.out.println("Current working directory: "+System.getProperty("user.dir"));
		System.out.println("Java version: "+System.getProperty("java.version"));
		System.out.println("Vendor name: "+System.getProperty("java.vendor"));
		System.out.println("Java class format version number: "+System.getProperty("java.class.version"));
		System.out.println("Class path is: "+System.getProperty("java.class.path"));
		System.out.println("Name of the JIT cimpiler used: "+System.getProperty("java.compiler"));
		System.out.println("Operating system name: "+System.getProperty("os.name"));
		System.out.println("Os Architecture: "+System.getProperty("os.arch"));
		System.out.println("Os version: "+System.getProperty("os.version"));
		System.out.println("Temporary clear cookies and sessions: "+System.clearProperty("user.home"));
		System.out.println("System user directory: "+System.getProperty("user.home")); //null value because it temporary clear the user/system property
		System.out.println("Set country: "+System.setProperty("user.country", "IND"));
		System.out.println("Get username and password: "+System.getProperty("user.password","None of your business")); //if user.password is null it will return none of your business
		System.out.println("Time in mili seconds: "+System.currentTimeMillis());
		System.out.println("Time in nano seconds: "+System.nanoTime());
		System.setProperty("user.home","G:\\Acceleration Institute\\01.10.22 Batch"); //it will temporary change the current system property to G:\\Acceleration Institute\\01.10.22 Batch--> once program over it will go back to the previous one 
		System.out.println("System user directory: "+System.getProperty("user.home")); //again goes to the previous system property
	}

}
