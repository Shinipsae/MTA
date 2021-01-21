package q06;
// number라는 값을 제곱하고, 그 수의 음수값을 구하시오.
public class Q06 {

	public static void main(String[] args) {
		int result;
		int number = 5;
		
		result = negativeSquare(number);
		System.out.println(result);
		
	}
	
	public static int negativeSquare(int number) {
		return -(number * number);
		// return -1 * (number * number)도 되지만, 칸이 정확해야함
	}

}

