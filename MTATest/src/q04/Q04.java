package q04;

public class Q04 {
	// 원의 넓이를 구하는 프로그램 작성
	public static void main(String[] args) {
		final double PI = 3.14; // 원주율을 상수로 선언 (순서중요)
		
		double radius = 10.0; // 원의 반지름
		double circleArea = radius * radius * PI; // 원의 넓이 계산
		
		// 원의 면적을 화면에 출력한다.
		System.out.println("원의 넓이: " + circleArea);

	}

}



