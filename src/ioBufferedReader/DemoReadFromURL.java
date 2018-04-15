package ioBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DemoReadFromURL {
	public static void main(String[] args) {
		try(BufferedReader reader = 
				new BufferedReader(new InputStreamReader(new URL("http://www.gutenberg.org/files/11/11-0.txt").openStream()))) {
			while (reader.ready()) {
				System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
