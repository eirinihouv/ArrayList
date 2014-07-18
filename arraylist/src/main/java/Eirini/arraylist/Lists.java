package Eirini.arraylist;

import java.util.*;

public class Lists {
	public static void main(String[] args) {

		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(1);

		sum = getSum(sum, list);

		System.out.println("The size of the list is: " + list.size());
		System.out.print("The sum is: " + sum);

	}

	public static int getSum(int sum, ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
