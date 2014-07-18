package Eirini.arraylist;

import java.util.*;

public class CriterionRemoval {
	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		myList.add(4);
		myList.add(3);
		myList.add(1);

		removeEvenNums(myList);

		System.out.println(myList);
	}

	public static void removeEvenNums(ArrayList<Integer> list) {

		Iterator<Integer> criterion = list.iterator();
		while (criterion.hasNext()) {
			int i = criterion.next();
			if (i % 2 == 0) {
				list.remove(i);
			}
		}
	}
}
