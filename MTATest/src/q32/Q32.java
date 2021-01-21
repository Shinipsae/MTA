package q32;

public class Q32 {

	public static void main(String[] args) {
	
		int[] numbers = new int[]{1, 2, 3};
		if(true) {
			int num = 1; // 지역변수
			if(num > 0) {
				num++;
			}
		}
		int num = 1; // 지역변수
		addOne(num); // 영향을 주지 않음
		System.out.println(num); // 1
		num = num-1;
		System.out.println(num); // 0
	}

	public static void addOne(int num) {
		num = num + 1;
	}

}
