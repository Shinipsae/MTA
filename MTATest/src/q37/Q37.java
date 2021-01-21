package q37;

public class Q37 {
	// String to double
	public static void main(String[] args) {
		convert("3.1415");
	}
	
	public static void convert(String numberAsString) {
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}

}
