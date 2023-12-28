package workwithtreemap;

import java.util.TreeMap;

public class demo1 {
	public static void main(String[] args) {
		TreeMap<Integer, String>h=new TreeMap<>();
		h.put(1, "Ravi");
		h.put(2, "Raviraj");
		h.put(4, "BhyRavi");
		h.put(65, "gandRavi");
		h.put(7, "bondRavi");
		h.put(2, "Andravi");
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.get(65));
		System.out.println(h.containsKey(2));
		
		
		
		
	}

}
