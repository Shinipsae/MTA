package q38;

import java.util.ArrayList;

public class Q38 {

	public static void main(String[] args) {
		int n = 10;
		double d = 3.14;
		ArrayList<String> arr = new ArrayList<String>();
		int[] arr1 = new int[1];
		
		// valueOf()
		Integer iNum1 = Integer.valueOf(n);
		// casting
		Integer iNum2 = (Integer)n;
		// type Ȯ��
		System.out.println(iNum1 instanceof Integer); // Integer�� �³�
		System.out.println(iNum2 instanceof Integer); // Integer�� �³�
		
		// valueOf()
		Double dNum1 = Double.valueOf(d);
		// casting
		Double dNum2 = (Double)d;
		// type Ȯ��
		System.out.println(dNum1 instanceof Double); // Double�� �³�
		System.out.println(dNum2 instanceof Double); // Double�� �³�
		
		// String to primitive
		int num = Integer.parseInt("123");
		System.out.println(num);
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		double d1 = Double.parseDouble("3.14");
		System.out.println(d1);
	}

}
