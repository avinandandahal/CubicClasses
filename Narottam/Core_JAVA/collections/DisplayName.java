package com.cubic.training.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayName {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any name (To Exit press N)");
		String name = scanner.nextLine();

		while (!name.equalsIgnoreCase("N")) {

			while (names.contains(name)) {
				System.out.printf("Name %s already present. Enter a unique name (To Exit press N)\n", name);
				name = scanner.nextLine();
			}

			names.add(name);

			System.out.println("Enter another name (To Exit press N)");
			name = scanner.nextLine();
		}
		System.out.println("Names You entered are : ");
		for (String i : names) {
			System.out.println(i);
		}
		scanner.close();
	}
}
