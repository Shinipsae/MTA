package q39;

public class Q39 {

	public static void main(String[] args) {
		String name = "���ٻ�";
		int age = 19;
		float eye = 1.5f;
		int money = 1000000;
		String info = String.format("�̸�:%s, ����:%d, �÷�:%.1f, ��������:%d��",
				name, age, eye, money);
		System.out.println(info);
	}

}