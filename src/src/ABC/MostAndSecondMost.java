package src.ABC;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostAndSecondMost {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 7, 4, 3, 6, 2, 2, 5, 8, 0, 7, 4, 3, 2, 4, 4, 5, 7, 9, 4 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int MostOccurrence = -1;
		int MostOccurrenceCount = 0;
		int SecondMostOccurrence = -1;
		int SecondMostOccurrenceCount = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();

			if (value > MostOccurrenceCount) {
				SecondMostOccurrence = MostOccurrence;
				SecondMostOccurrenceCount = MostOccurrenceCount;

				MostOccurrence = key;
				MostOccurrenceCount = value;

			} else if (value > SecondMostOccurrenceCount && key != MostOccurrence) {
				SecondMostOccurrence = key;
				SecondMostOccurrenceCount = value;
			}
		}
		System.out.println("Most Occurring number: " + MostOccurrence + ", Times: " + MostOccurrenceCount);
		System.out.println("Second Most Occurring number: " + SecondMostOccurrence + ", Times: " + SecondMostOccurrenceCount);
	}
}
