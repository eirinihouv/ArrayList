package Eirini.arraylist;

import java.util.*;

public class ReverseList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(1);

		reverse(list);
		
		System.out.println("List now contains: " + list);
	}

	public static void reverse(ArrayList<Integer> list) {

		Collections.reverse(list);
	}
}
