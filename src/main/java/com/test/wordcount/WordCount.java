package com.test.wordcount;

import java.util.*;

public class WordCount {

	public static void isPresent(String s) {
		String[] count = s.split(" ");
		Map<String, Integer> n = new HashMap<String, Integer>();

		for (int i = 0; i < count.length; i++) {
			if (n.containsKey(count[i])) {
				int cont = n.get(count[i]);
				n.put(count[i], cont + 1);
			} else {
				n.put(count[i], 1);
			}
			/*
			 * Set<String> set=n.keySet(); Iterator<String> itr=set.iterator();
			 * while(itr.hasNext()){ System.out.println(itr.next()+" "+count[i]); }
			 */
		}
		System.out.println(n);
		}
	

}
