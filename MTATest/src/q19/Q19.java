package q19;

public class Q19 {

	public static void main(String[] args) {
		System.out.print("문장을 입력하세요: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		while(input.hasNext()) { // token단위로 구분하는 메서드
			System.out.println(input.next());
		}
	}

}





