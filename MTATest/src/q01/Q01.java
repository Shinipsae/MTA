package q01;

public class Q01 {
	
	public static void main(String[] args) {
		double pi = Math.PI; // 3.141592...
		double x = 1.9999; // �ݿø�, �ʰ��� �ڸ��� ó�� Ȯ��
		
		System.out.format("PI is %.3f%n", pi); // �Ҽ��� ���� �� �ڸ� -> 3.142
		System.out.format("PI is %.0f%n", pi); // ���� -> 3
		System.out.format("PI is %.09f%n", pi); // �Ҽ��� ���� ��ȩ �ڸ� -> 3.141592654
		
		System.out.format("x is %.3f%n", x); // �Ҽ��� ���� �� �ڸ�(�ݿø�) -> 2.000
		System.out.format("x is %.0f%n", x); // ���� -> 2
		System.out.format("x is %.09f%n", x); // �Ҽ��� ���� ��ȩ �ڸ�(�ڸ�ä��) -> 1999900000
	}	
	
}



