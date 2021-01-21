package q05;

public class Q05 {

	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // auto boxing (자동 박싱)
		// Integer intObject = Integer.valueOf(n); 와 같음
		System.out.println("intObject: " + intObject);
		System.out.println("intObject의 자료형: " + intObject.getClass().getName());
		
		int m = intObject + 10; // auto boxing (자동 박싱)
		// int m = intObject.intValue() + 10; // 와 같음
		System.out.println("m: " + m);
		// System.out.println("m의 자료형: " + m.getClass().getName());
		// 기본자료형이기 때문에 .getClass().getName() 방식으로 확인 불가
	}

}







