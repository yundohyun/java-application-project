package week_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("./src/week_4/assets/lyrics.txt");
			int ch;
			while ((ch = fin.read()) != -1) // 하나 읽고
				System.out.print((char) ch); // 하나 출력
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("I/O Error");
		}
	}
}
