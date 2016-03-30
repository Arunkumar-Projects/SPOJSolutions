package program2;

import java.util.ArrayList;
import java.util.Scanner;

public class HalfOfHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// number of inputs to be processed
		int numberOfTcds = sc.nextInt();

		// storing the inputs into the list for processing
		ArrayList<String> inputStrings = new ArrayList<String>();
		for (int i = 0; i < numberOfTcds; i++) {
			inputStrings.add(sc.next());
		}
		printResults(inputStrings);

	}

	private static void printResults(ArrayList<String> inputStrings) {
		for (String str : inputStrings) {
			int newLength = str.length() / 2;
			String halfString = str.substring(0, newLength);
			printHalfofHalf(halfString);
		}

	}

	private static void printHalfofHalf(String halfString) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = halfString.toCharArray();
		for (int i = 0; i < charArray.length; i += 2) {
			sb.append(charArray[i]);
		}
		System.out.println(sb.toString());
	}
}