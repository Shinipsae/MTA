package q20;

import java.io.IOException;
import java.util.Scanner;

public class Q20 {
	
	public static void main(String[] args) {
		System.out.println(getBirthDate());
	}

	// Scanner�� �̿��ϴ� ���
	public static String getBirthDate() { 
		System.out.print("������ YYMMDD �������� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;

	} 
	
	// InputStream�� �̿��ϴ� ��� (������ ����)
/*	public static int getBirthDate() throws IOException { 
		System.out.print("������ YYMMDD �������� �Է��ϼ���: ");
		InputStream stream = System.in;
		int birthdate = stream.read();
		stream.close();
		return birthdate;
	} */

}








