package Eirini.arraylist;

import java.util.*;

public class Merge {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(2);
		list2.add(4);
		list2.add(6);

		mergeLists(list, list2);

		System.out.println(list);
	}

	public static void mergeLists(ArrayList<Integer> list,
			ArrayList<Integer> list2) {

		for (int i = 0; i < list2.size(); i++)
			if (!list.contains(list2.get(i))) {
				list.add(list2.get(i));
			}
	}
}