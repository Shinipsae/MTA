package q31;

public class Q31 {

	public static void main(String[] args) {
		int anum = 55;
		for(int cnt = 0; cnt < 10; cnt++) {
			add(anum);
		}
		System.out.println(anum); // 55로 증가되지않음
		// System.out.println(cnt); 에러 
	}
	
	public static void add(int anum) {
		anum++;
		System.out.println(anum); // 항상 56
	}

}
