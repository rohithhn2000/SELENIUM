package workingWithSets;

import java.util.Iterator;
import java.util.TreeSet;

public class worktree {
	public static void main(String[] args) {
		TreeSet t = new TreeSet() ;
		t.add(10);
		t.add(31);
		t.add(1);
		t.add(5);
		t.add(7);
		System.out.println(t);
		System.out.println("Printing the element in ascending order");
		Iterator i1=t.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}
}
