package q21;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 탁월 2 우수 3 양호 4 불량");
		Object data1 = sc.next(); // 토큰
		Object data2 = sc.next(); // 토큰
		Object data3 = sc.nextInt(); //정수 
		Object data4 = sc.nextLine(); // 공백을 포함한 남은 문장
		
		System.out.println(data1); // 1
		System.out.println(data2); // 탁월
		System.out.println(data3); // 2
		System.out.println(data4); // 우수 3 양호 4 불량

	}

}




