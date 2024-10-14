package ABC;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostOccuranceCharacter {

	public static void main(String[] args) {
		String str = "TEKFRIDAY PROCESING PVT LTD SOLUTIONS";
		System.out.println(str);
		str = str.replace(" ", "");

		char arr[] = str.toCharArray();

		int i = 0;
		int size = arr.length;
		Map<Character, Integer> map = new LinkedHashMap<>();

		while (i != size) {
			if (map.containsKey(arr[i]) == false) {
				map.put(arr[i], 1);
			} else {
				int old = map.get(arr[i]);
				int neww = old + 1;
				map.put(arr[i], neww);
			}
			i++;
		}

		char maxChar = ' ';
		int maxNumber = 0;
		int secondNumber = 0;
		char secondChar = ' ';

		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> data : hmap) {
			if (data.getValue() > maxNumber) {
				secondChar = maxChar;
				secondNumber = maxNumber;
				maxChar = data.getKey();
				maxNumber = data.getValue();
			} else if (data.getValue() > secondNumber) {
				secondChar = data.getKey();
				secondNumber = data.getValue();

			}

		}

		System.out.println("Most frequent character: " + maxChar + " (Count: " + maxNumber + ")");
		System.out.println("Second most frequent character: " + secondChar + " (Count: " + secondNumber + ")");

	}// another method

	public static void did() {
		String str = "TEKFRIDAY PROCESSING PVT LTTD SOLUTIONS";
		System.out.println(str);
		str = str.replace(" ", "");

		char arr[] = str.toCharArray();
		int Max = 0;
		int Min = 0;
		char ch = ' ';
		char ch2 = ' ';

		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {

					count++;
				}
			}
			if (arr[i] != '0') {
				System.out.println(arr[i] + "  " + count);
			}
			if (count > 1) {
				if (count > Max) {
					Min = Max;
					ch = arr[i];
					Max = count;
					ch2 = arr[i];

				} else if (Max > count && Min < count) {
					Min = count;
					ch = arr[i];
				}
			}
		}

		System.out.println("SecMax " + ch + " Count " + Min);
		System.out.println("SecMax " + ch2 + " Count " + Max);

	}

}
