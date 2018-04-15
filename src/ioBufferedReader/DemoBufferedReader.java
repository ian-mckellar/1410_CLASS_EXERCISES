package ioBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates how to use BufferedReader and
 * @author ian
 *
 */
public class DemoBufferedReader {

	public static void main(String[] args) {
		try(BufferedReader reader = 
				new BufferedReader(new FileReader("src/ioBufferedReader/Resources/Cities"))) {
			int lineNumber = 1;
			while(reader.ready()) {
				System.out.printf("%02d %s%n", lineNumber++, reader.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
