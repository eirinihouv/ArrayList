package Eirini.arraylist;

import java.util.*;

public class SortList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(1);

		sort(list);

		System.out.println("List is sorted: ");

		for (int i : list) {
			System.out.println(i);
		}
	}

	public static void sort(ArrayList<Integer> list) {

		Collections.sort(list);

	}
}