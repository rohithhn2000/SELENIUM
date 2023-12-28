package workingWithSets;

import java.util.HashSet;
import java.util.Iterator;

public class practice_hashset {
	public static void main(String[] args) {
		HashSet h=new HashSet<>();
		h.add(10);
		h.add(10);
		h.add("Hello");
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

}
}
