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
		// 25 이상인 경우 모두 나열 불가
		/*
		 * switch (age) {
		 * case 25:
		 * case 26:
		 */
		
		String grade = "a";
		String message = "";
		if(grade == "A") {
			message = "표준 초과";
		} else if(grade == "B") {
			message = "표준충족";
		} else {
			message = "개선 필요";
		}

		switch(grade) {
		case "A": message = "표준초과"; break;
		case "B": message = "표주충족"; break;
		default: message = "개선필요";
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
		
		// 실수이므로 switch-case문 사용 불가
	}

}
