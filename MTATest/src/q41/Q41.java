package q41;

public class Q41 {

	public static void main(String[] args) {
		System.out.println(showGreeting("���ٻ�"));
	}
	
	public static String showGreeting(String firstName) {
		String welcomeMsg = "�ȳ��ϼ���";
		welcomeMsg += (firstName.substring(0, 1).toUpperCase() +
				firstName.substring(1).toLowerCase());
				return welcomeMsg;
	}

}
