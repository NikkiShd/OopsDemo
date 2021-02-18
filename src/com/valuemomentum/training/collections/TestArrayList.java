package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static <E> void main(String[] args) {

		List<String> al=new ArrayList<String>(); //creating ArrayList
		al.add("Jim");
		al.add("Michael");
		al.add("James");
		al.add("Andy");
		
		//traversing elements using Iterator
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		al.add(3,"Raj");
		al.remove(0);
		al.set(1, "Java");
		//Display using foreach
		System.out.println("Display using foreach loop");
		for(String i:al) {
			System.out.println(i);
		}
		}

}
