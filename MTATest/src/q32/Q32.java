package q32;

public class Q32 {

	public static void main(String[] args) {
	
		int[] numbers = new int[]{1, 2, 3};
		if(true) {
			int num = 1; // ��������
			if(num > 0) {
				num++;
			}
		}
		int num = 1; // ��������
		addOne(num); // ������ ���� ����
		System.out.println(num); // 1
		num = num-1;
		System.out.println(num); // 0
	}

	public static void addOne(int num) {
		num = num + 1;
	}

}
