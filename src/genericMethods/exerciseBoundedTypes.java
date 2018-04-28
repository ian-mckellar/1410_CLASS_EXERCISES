package genericMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class exerciseBoundedTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<>();
		
		Collections.addAll(words, "one", "two", "three", "four", "five");
		
		System.out.println("The smallest word is: " + smallest(words.get(0), words.get(1), words.get(2))  + " of " + words);
		
	}

	public static <T extends Comparable<T>> T smallest(T x, T y, T z) {
		T result = x;
		
		if (y.compareTo(result) < 0) {
			result = y;
		}
		if (z.compareTo(result) < 0) {
			result = z;
		}
		
		return result;
	}
}
