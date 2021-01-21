package q03;

public class Q03 {
/* number이라는 숫자 원시 변수를 text라는 String 변수로 변환하는 Java 코드를 작성하고 있다.
 * 요건을 충족하면 예, 그렇지 않으면 아니오를 선택하시오.*/
	public static void main(String[] args) {
		int number = 10;
		// String text1 = '' + number; // 작은따옴표 안됨
		String text2 = "" + number;
		// String text3 = number.toString(); // number가 기본타입이라서 안됨 (Integer면 객체므로)
		String text4 = String.valueOf(number); // 해당 객체로 저장
		
		// 1. String.valueOf() : String으로 저장
		// 2. Integer.valueOf() : Integer 저장
		// 3. Double.valueOf() : Double로 저장
		
		Integer iNum = Integer.valueOf("10"); // Integer
		Double iDouble = Double.valueOf(10); // Double
		
		Integer num2 = 20; // 
		String text5 = num2.toString();
		// toString() : 반드시 리턴이 String이다 주의!
		
		System.out.println("text2의 자료형: " + text2.getClass().getName()); // String
		System.out.println("text4의 자료형: " + text4.getClass().getName()); // String
		System.out.println("iNum의 자료형: " + iNum.getClass().getName()); // Integer
		System.out.println("iDouble의 자료형: " + iDouble.getClass().getName()); // Double
		System.out.println("num2의 자료형: " + num2.getClass().getName()); // Integer
		System.out.println("text5의 자료형: " + text5.getClass().getName()); // String
	}
	
}




