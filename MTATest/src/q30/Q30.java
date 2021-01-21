package q30;

public class Q30 {
	private int id = 3;
	
	protected void showId() {
		System.out.println(id);
	}

	public static void main(String[] args) {
		Q30 q = new Q30();
		q.id = 5;
		q.showId();
	}

}
