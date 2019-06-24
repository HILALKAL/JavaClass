package com.Class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Task {
/*
 * 1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.
 */
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Kemal");
		list.add("Zulal");
		list.add("Elif");
		
		System.out.println("---using Collections class sort the values of that ArrayList---");
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("---------------");
		
	//2. Create an array of Strings and using Arrays class sort the values of that array of Strings.
		System.out.println("---using Arrays class sort the values of that array of Strings---");
		
		String[] name= {"puplic","static","void"};
		Arrays.sort(name);
		for(String str:name) {
			System.out.println(str);
		}

		System.out.println("-----------------");
		
	//3. Create an HashSet of cities and add duplicates into it.
	//    Retrieve all values from hashset in 2 different ways.
	//    Retrieve all values in alphabetical order.
		
		
		HashSet<String> city=new HashSet<>();
		
		city.add("Grand Prairie");
		city.add("Dallas");
		city.add("Plano");
		city.add("Grand Prairie");
		
		System.out.println("-----1st way ------");
		for(String cities:city) {
		System.out.println(cities);
		}
		
		System.out.println("------2nd way ------ ");
		Iterator<String> it=city.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----Retrieve all values in alphabetical order-----");
		ArrayList <String> alist=new ArrayList<String>(city);
	    Collections.sort(alist);
		System.out.println(alist);
	}
	
}
