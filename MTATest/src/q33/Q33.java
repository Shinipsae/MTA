package q33;

public class Q33 {
	int x = 25; // 필드
	public static void main(String[] args) {
		Q33 app = new Q33();
		{
			int x = 5;
		}
		{
			int x = 10;
		}
		int x = 100;
		System.out.println(x); // 100
		System.out.println(app.x); // 25(필드)
	}

	public Q33() { // 생성자 (가장먼저실행)
		int x = 1;
		System.out.println(x);
	}
	
}
