package Curs8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		set.add("rosu");
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.add("verde");
		set.add("galben");
		set.add("maro");
		
		System.out.println(set.size());
		System.out.println(set.contains("galben"));
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// for face acelasi lucru ca iteratorul
		for(String element :set) {
			System.out.println(element);
		}
	}

}
