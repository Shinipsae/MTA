package q41;

public class Q41 {

	public static void main(String[] args) {
		System.out.println(showGreeting("Ω≈¿Ÿªı"));
	}
	
	public static String showGreeting(String firstName) {
		String welcomeMsg = "æ»≥Á«œººø‰";
		welcomeMsg += (firstName.substring(0, 1).toUpperCase() +
				firstName.substring(1).toLowerCase());
				return welcomeMsg;
	}

}
