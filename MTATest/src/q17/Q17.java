package q17;

public class Q17 {
	// default�� ���� ��Ű��
	// protected ���� Ŭ����
	// private Ŭ���� ����
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		number(12, 10);
	}
	
	public static int number(int x, int y) { // static �޼ҵ�� ��ü ���� ���̵� ��밡��
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





