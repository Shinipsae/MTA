package q43;

public class Q43 {
	boolean isPreserved = false;
	private boolean isCreated = false;
	
	void preserve() {
		isPreserved = true;
	}
	
	public static void main(String[] args) {
		Q43 pickle = new Q43();
		pickle.isCreated = true;
		pickle.preserve();

	}

}
