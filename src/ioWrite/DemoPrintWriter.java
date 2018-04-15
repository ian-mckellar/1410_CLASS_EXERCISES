package ioWrite;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoPrintWriter {

	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter("src/ioWrite/Resources/Numbers.txt")) {
			writer.printf("%11s | %11s | %11s | %11s |%n", "Decimal", "Binary", "Octal", "Hexadecimal");
			writer.println("=======================================================");
			for (int i = 1; i <= 20; i++) {
				writer.printf("%11d | %11s | %11s | %11s |%n", i, Integer.toBinaryString(i), Integer.toOctalString(i), Integer.toHexString(i));
			}
			writer.println("=======================================================");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
