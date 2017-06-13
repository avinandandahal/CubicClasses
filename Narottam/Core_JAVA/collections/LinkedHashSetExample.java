package com.cubic.training.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> s = new LinkedHashSet<>();
		s.add("Ram");
		s.add("Alok");
		s.add("Sushant");
		s.add("Avwan");
		s.add("Ram");
		s.add("Avwan");

		for (String a : s) {
			System.out.println(a);
		}
	}
}
