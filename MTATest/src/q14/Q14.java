package q14;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		System.out.print("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); // sc.nextLine()�� \n ����, next()�� ������
		System.out.print("�̸��� " + name + ", ");
		
		String city= sc.next(); // String
		System.out.print("���ô� " + city + ",");
		
		int age = sc.nextInt(); // ����
		System.out.print("���̴� " + age + "��, ");
		
		double weight = sc.nextDouble(); // �Ǽ�
		System.out.print("ü���� " +  weight + "kg, ");
		
		boolean single = sc.nextBoolean(); // ������
		System.out.print("���� ���δ� " + single + "�Դϴ�.");
		
		sc.close();

	}

}

