package q25;

public class Q25 {

	public static void main(String[] args) {
		double discount;
		int age = 0;
		if(age >= 25) {
			discount = 0.5;
		} else if (age >= 21) {
			discount = 0.25;
		} else {
			discount = 0;
		}
		// 25 �̻��� ��� ��� ���� �Ұ�
		/*
		 * switch (age) {
		 * case 25:
		 * case 26:
		 */
		
		String grade = "a";
		String message = "";
		if(grade == "A") {
			message = "ǥ�� �ʰ�";
		} else if(grade == "B") {
			message = "ǥ������";
		} else {
			message = "���� �ʿ�";
		}

		switch(grade) {
		case "A": message = "ǥ���ʰ�"; break;
		case "B": message = "ǥ������"; break;
		default: message = "�����ʿ�";
		}
		
		double gpa = 0.0;
		int priority = 0;
		if(gpa == 4.0) {
			priority = 1;
		} else if(gpa == 3.0) {
			priority = 2;
		} else if(gpa >= 2.5) {
			priority = 3;
		}
		
		// �Ǽ��̹Ƿ� switch-case�� ��� �Ұ�
	}

}