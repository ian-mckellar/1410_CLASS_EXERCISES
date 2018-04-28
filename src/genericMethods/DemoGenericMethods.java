package genericMethods;

import java.util.Arrays;

public class DemoGenericMethods {

	public static void main(String[] args) {
		// String array
		String[] words = {"ape", "bee", "cat", "dog", "eel", "fly", "gnu", "hat"};
		System.out.println("words: "+ Arrays.toString(words));
		
		swap(words, 0, words.length - 1);
		System.out.println("words: "+ Arrays.toString(words));
		
		// Integer array
		Integer[] numbers = {77, 55, 48, 32, 86, 88, 25, 13};
		System.out.println("numbers: " + Arrays.toString(numbers));
		
		swap(numbers, 0 ,numbers.length - 1);
		System.out.println("numbers: " + Arrays.toString(numbers));
		
		reverse(words);
		System.out.println("words: "+ Arrays.toString(words));
		
	}

	/**
	 * swaps the elements on index1 and index2
	 * @param ints
	 * @param index1
	 * @param index2
	 */
	private static <T> void swap(T[] ints, int index1, int index2) {
		T temp = ints[index1];
		ints[index1] = ints[index2];
		ints[index2] = temp;
	}

	/**
	 * reverse the elements of the arrys
	 * @param array
	 * @return
	 */
	private static <T> T[] reverse(T[] array) {
		int length = array.length;
		T[] newArray = Arrays.copyOf(array, length);
		for (int i = 0; i < length; i++) {
			newArray[i] = array[length - 1 - i];
		} 
		
		return newArray;
	}
}
