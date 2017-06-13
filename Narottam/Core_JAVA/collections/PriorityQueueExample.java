package com.cubic.training.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> s = new PriorityQueue<>();
		s.add("Ram");
		s.add("Binod");
		s.offer("Sushant");
		s.offer("Avwan");
		

		System.out.println("Printing head element using peek: " + s.peek());
		System.out.println("Printing head element using element: " + s.element());

		s.remove();
		System.out.println("The head element after using remove is: " + s.peek());

		System.out.println("Printing the elements after remove: ");
		for (String a : s) {
			System.out.println(a);
		}

		System.out.println("The new head element after removing the previous head element is: " + s.peek());

		s.poll();
		System.out.println("The head element after using poll is: " + s.peek());

		System.out.println("Printing the elements after poll: ");
		for (String a : s) {
			System.out.println(a);
		}

		System.out.println("The new head element after removing the previous head element: " + s.peek());
	}
}
