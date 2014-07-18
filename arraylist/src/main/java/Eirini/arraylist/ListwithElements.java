package Eirini.arraylist;

import java.util.*;

public class ListwithElements {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 5, 3, 1);

		System.out.println(list);
	}
}
