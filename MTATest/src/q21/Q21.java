package q21;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 Ź�� 2 ��� 3 ��ȣ 4 �ҷ�");
		Object data1 = sc.next(); // ��ū
		Object data2 = sc.next(); // ��ū
		Object data3 = sc.nextInt(); //���� 
		Object data4 = sc.nextLine(); // ������ ������ ���� ����
		
		System.out.println(data1); // 1
		System.out.println(data2); // Ź��
		System.out.println(data3); // 2
		System.out.println(data4); // ��� 3 ��ȣ 4 �ҷ�

	}

}



