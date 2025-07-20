package src.ABC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeysToValue__ValuesToKey {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 2, 3, 1, 5, 6 };
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		int i = 0;
		while (i != n) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int oldvalue = map.get(arr[i]);
				map.put(arr[i], oldvalue + 1);
			}
			i++;
		}

		// Original Map Output
		System.out.println("Original Map:");
		for (Map.Entry<Integer, Integer> data : map.entrySet()) {
			System.out.println(data.getKey() + " --> " + data.getValue());
		}

		// Swap keys and values
		Map<Integer, Integer> reversedMap = new HashMap<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			reversedMap.put(entry.getValue(), entry.getKey()); // value -> key
		}

		// Reversed Map Output
		System.out.println("\nReversed Map (values as keys):");
		for (Map.Entry<Integer, Integer> entry : reversedMap.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
