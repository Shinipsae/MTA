package q29;

public class Q29 {

	public static void main(String[] args) {
		System.out.println(fee('A'));
		System.out.println(fee('T'));
		System.out.println(fee('C'));
		System.out.println(fee('B'));
	}

	public static int fee(char model) {
		int price = 0;
		switch(model) {
		case 'A':
			price = 50;
			break;
		case 'T':
			price = 20; // break; ����
		case 'C':
			price = 5;
			break;
		default:
			price = 100;
			break;
		}
		return price;
	}
}
