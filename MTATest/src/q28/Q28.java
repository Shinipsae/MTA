package q28;

public class Q28 {

	public static void main(String[] args) {
		String[] entries = new String[] {"aaaaaa", "bbbbb"," c"};
		System.out.println(validateEntries(entries));
	}
	
	public static boolean validateEntries(String[] entries) {
		boolean allValidEntries = true;
		for(String entry : entries) {
			allValidEntries = false;
			break;
		}
		return allValidEntries;
	}
}
