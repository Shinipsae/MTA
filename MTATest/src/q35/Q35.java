package q35;

public class Q35 {

	public static void main(String[] args) {
		String firstName = "Christopher";
		firstName = firstName.substring(0, 5); // 0���� 6������� ��
		String output = String.format("%s is %d characters long", firstName, firstName.length());
		System.out.println(output);
	}

}