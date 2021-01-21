package q02;

public class Q02 {
/* 계정을 관리하는 Java 프로그램을 작성하기 위해 당신을 고용합니다.
 * 새 계정을 개설하려면 사용자는 다음 요건 중 하나를 충족해야 합니다.
 * - 65세 초과 고령자이며 최소 연간 소득이 10000임
 * - 21세 이상이며 연간 소득이 25000 초과해야함
 * 적합한 연산자를 올바른 위치로 끌어오십시오. 
 * 각 연산자는 한번 이상 사용되거나 전혀 사용되지 않을 수 있습니다. */
	public static void main(String[] args) {
		// 테스트를 위한 age와 income 초기화
		int age = 21; 
		int income = 26000;
		
		if(age > 65 && income >= 10000 ||
			age >= 21 && income > 25000) {
			System.out.println("Approved");
		} else {
			System.out.println("Declined");
		}
		
	}

}


