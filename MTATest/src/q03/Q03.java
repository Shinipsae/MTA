package q03;

public class Q03 {
/* number�̶�� ���� ���� ������ text��� String ������ ��ȯ�ϴ� Java �ڵ带 �ۼ��ϰ� �ִ�.
 * ����� �����ϸ� ��, �׷��� ������ �ƴϿ��� �����Ͻÿ�.*/
	public static void main(String[] args) {
		int number = 10;
		// String text1 = '' + number; // ��������ǥ �ȵ�
		String text2 = "" + number;
		// String text3 = number.toString(); // number�� �⺻Ÿ���̶� �ȵ� (Integer�� ��ü�Ƿ�)
		String text4 = String.valueOf(number); // �ش� ��ü�� ����
		
		// 1. String.valueOf() : String���� ����
		// 2. Integer.valueOf() : Integer ����
		// 3. Double.valueOf() : Double�� ����
		
		Integer iNum = Integer.valueOf("10"); // Integer
		Double iDouble = Double.valueOf(10); // Double
		
		Integer num2 = 20; // 
		String text5 = num2.toString();
		// toString() : �ݵ�� ������ String�̴� ����!
		
		System.out.println("text2�� �ڷ���: " + text2.getClass().getName()); // String
		System.out.println("text4�� �ڷ���: " + text4.getClass().getName()); // String
		System.out.println("iNum�� �ڷ���: " + iNum.getClass().getName()); // Integer
		System.out.println("iDouble�� �ڷ���: " + iDouble.getClass().getName()); // Double
		System.out.println("num2�� �ڷ���: " + num2.getClass().getName()); // Integer
		System.out.println("text5�� �ڷ���: " + text5.getClass().getName()); // String
	}
	
}



