package q05;

public class Q05 {

	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // auto boxing (�ڵ� �ڽ�)
		// Integer intObject = Integer.valueOf(n); �� ����
		System.out.println("intObject: " + intObject);
		System.out.println("intObject�� �ڷ���: " + intObject.getClass().getName());
		
		int m = intObject + 10; // auto boxing (�ڵ� �ڽ�)
		// int m = intObject.intValue() + 10; // �� ����
		System.out.println("m: " + m);
		// System.out.println("m�� �ڷ���: " + m.getClass().getName());
		// �⺻�ڷ����̱� ������ .getClass().getName() ������� Ȯ�� �Ұ�
	}

}






