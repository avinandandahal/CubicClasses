package com.cubic.training.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<>();
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
