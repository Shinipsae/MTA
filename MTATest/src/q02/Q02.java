package q02;

public class Q02 {
/* ������ �����ϴ� Java ���α׷��� �ۼ��ϱ� ���� ����� �����մϴ�.
 * �� ������ �����Ϸ��� ����ڴ� ���� ��� �� �ϳ��� �����ؾ� �մϴ�.
 * - 65�� �ʰ� �������̸� �ּ� ���� �ҵ��� 10000��
 * - 21�� �̻��̸� ���� �ҵ��� 25000 �ʰ��ؾ���
 * ������ �����ڸ� �ùٸ� ��ġ�� ������ʽÿ�. 
 * �� �����ڴ� �ѹ� �̻� ���ǰų� ���� ������ ���� �� �ֽ��ϴ�. */
	public static void main(String[] args) {
		// �׽�Ʈ�� ���� age�� income �ʱ�ȭ
		int age = 21; 
		int income = 26000;
		
		if(age > 65 && income >= 10000 ||
			age >= 21 && income > 25000) {
			System.out.println("Approved");
		} else {
			System.out.println("Declined");
		}
		
	}

}

