package q16;

import java.util.Scanner;

public class Q16 {
	// 커피메뉴의 가격을 알려주는 프로그램을 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 커피를 드릴까요? ");
		String order = sc.next();
		int price = 0;
		
		switch(order) { 
		case "에스프레소": // 리터럴 값만 가능, 실수는 불가능 ***
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		if(price != 0)
			System.out.println(order + "는 " + price + "원입니다.");
		sc.close();
	}

}



