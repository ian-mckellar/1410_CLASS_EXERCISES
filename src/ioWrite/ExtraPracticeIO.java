package ioWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExtraPracticeIO {

	public static void main(String[] args) {
		// createParrern1();
		// Read pattern1, modify it and store the result as parrern 2
		
		try(BufferedReader reader = new BufferedReader(new FileReader("src/ioWrite/Resources/Pattern1.txt")); 
				PrintWriter write = new PrintWriter("src/ioWrite/Resources/Pattern2.txt")) {
			while (reader.ready()) {
				String line = reader.readLine();
				write.println(line + " " + flippedLine(line));
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String flippedLine(String line) {
		line = line.replace('o', 'x');
		StringBuilder sb = new StringBuilder(line);
		return sb.reverse().toString();
	}

	private static void createParrern1() {
		try (PrintWriter writer = new PrintWriter("src/ioWrite/Resources/Pattern1.txt")) {
			writer.println("      o");
			writer.println("    o o");
			writer.println("  o o o");
			writer.println("o o o o");
			writer.println("  o o o");
			writer.println("    o o");
			writer.println("      o");
		} catch (FileNotFoundException e) {
			e.printStackTrace();			
		}
	}

}
