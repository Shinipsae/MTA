package q17;

public class Q17 {
	// default는 같은 패키지
	// protected 하위 클래스
	// private 클래스 내부
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		number(12, 10);
	}
	
	public static int number(int x, int y) { // static 메소드는 객체 생성 없이도 사용가능
		if(x > y) {
			System.out.println(x);
			return x;
		}
		else {
			System.out.println(y);
			return y;
		}
	}

}






