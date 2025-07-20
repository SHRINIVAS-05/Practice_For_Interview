package src.ABC;

import java.util.*;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 2, 3, 1, 5, 6 };
		InHashMap(arr);
	}

	private static void InHashMap(int arr[]) {
		int n = arr.length;
		int i = 0;
		Map<Integer, Integer> map = new java.util.HashMap<>();

		while (i < n) {
			if (map.containsKey(arr[i]) == false) {
				map.put(arr[i], 1);
			} else {
				int old = map.get(arr[i]);
				int Nwvalue = old + 1;
				map.put(arr[i], Nwvalue);
			}
			i++;
		}

		Set<Map.Entry<Integer, Integer>> data = map.entrySet();
		for (Entry<Integer, Integer> hamp : data) {
			System.out.println(hamp.getKey() + ": Occurs --> : " + hamp.getValue() + " Times");
		}
	}

}
