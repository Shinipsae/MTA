package q23;

import java.util.ArrayList;

public class Q23 {

	public static void main(String[] args) {
		ArrayList<String> in = new ArrayList<String>();
		in.add("a");
		in.add("b");
		in.add("c");
		for(String obj : in){
			System.out.println(obj);
		}
		Process(in);
	}
	
	public static void Process(ArrayList<String> invoices) {
		for(int i = 0; i < invoices.size(); i++) {
			String invoice = invoices.get(i);
			invoices.remove(i);
			System.out.println(invoices);
		}
	}

}




