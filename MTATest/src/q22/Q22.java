package q22;

public class Q22 {
	// 배열안에 같은 숫자가 있는지 판단하는 메소드 작성
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 3};
		duplicate(array);
	}
	
	public static boolean duplicate(int[] array) {
		boolean isDuplicate = false;
		for(int x = 0; x <= array.length-1; x++) {
			for(int y = x + 1; y < array.length; y++) {
				if(array[x] == array[y]) {
					isDuplicate = true;
					if(isDuplicate)
						break;
				}
			//	System.out.println(array[y]);
			}
		}
		System.out.println(isDuplicate);
		return isDuplicate;
	}

}




