package Eirini.arraylist;

import java.util.*;

public class DeleteElements {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(1);

		int i = 2;

		removeElement(i, list);

		System.out.println("List cointains: " + list);
	}

	public static void removeElement(int i, ArrayList<Integer> list) {

		list.remove(i);
	}

}
