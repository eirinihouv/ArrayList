package Eirini.arraylist;

import java.util.*;

public class ArrayToList {
	public static void main(String[] args) {
	
	int[] array= {5, 3, 1};
	int i=0;
	ArrayList<Integer> list = new ArrayList<Integer>(array.length);
	
System.out.println("1. Array: " + array[i] + ", " + array[i+1] + ", " + array[i+2]);

AtoL(array, list);

System.out.println("2. Array to ArrayList: " + list);

int[] array2 = new int[list.size()];

LtoA(array2, list);

System.out.println("3. ArrayList to Array: " + + array2[i] + ", " + array2[i+1] + ", " + array2[i+2]);
	

	}
	public static void AtoL(int[] array, ArrayList<Integer> list) {
		
for (int j : array) {
	list.add(j);
	}
}
	
public static void LtoA(int[] array2, ArrayList<Integer> list) {
	
	for (int k = 0; k<list.size(); k++) {
	array2[k]=list.get(k);
			}
		}
}
