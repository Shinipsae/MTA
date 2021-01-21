package q10;

public class Q10 {
	// 9번째 줄과 13번째 줄의 출력 결과는?
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int c = ++a * b--;
		System.out.println(c); // 60
		
		int d = a-- + ++b;
		System.out.println(d); // 16
	}

}


