package q06;
// number��� ���� �����ϰ�, �� ���� �������� ���Ͻÿ�.
public class Q06 {

	public static void main(String[] args) {
		int result;
		int number = 5;
		
		result = negativeSquare(number);
		System.out.println(result);
		
	}
	
	public static int negativeSquare(int number) {
		return -(number * number);
		// return -1 * (number * number)�� ������, ĭ�� ��Ȯ�ؾ���
	}

}

