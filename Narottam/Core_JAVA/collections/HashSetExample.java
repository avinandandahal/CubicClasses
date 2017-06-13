package com.cubic.training.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<>();
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
