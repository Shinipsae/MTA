package q18;

public class Q18 {
	// ���ڿ� �� ���ϱ�
	public static void main(String[] args) {
		String text1 = new String("Hello");
		String text2 = new String("Hello");
		System.out.println(text1 == text2); // false (��ü �ּҰ���)
		System.out.println(text1.equals(text2)); // true (��ü ����)
		
		String text3 = "hello";
		String text4 = "hello1";
		String text5 = text4.substring(0, 5);
		String text6 = "hello";
		String text7 = "hello";
		System.out.println(text3 == text6); // true (���� �ּҰ���)
		System.out.println(text3 == text5); // false (���� �ּҰ���)
		System.out.println(text3.equals(text6)); // true (���� ����)

	}
}



