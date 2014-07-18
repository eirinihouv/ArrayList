package Eirini.arraylist;

import java.util.*;

public class EmptyList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(1);

		emptyList(list);

		System.out.println("The size of the list is: " + list.size());
	}

	public static void emptyList(ArrayList<Integer> list) {

		list.clear(); // Emptying the list
	}

}
