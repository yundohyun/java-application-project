package week_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try {
      FileWriter file = new FileWriter("./src/week_4/assets/test.txt");
      while (true) {
        String line = in.nextLine();
        if (line.length() == 0) break;
        file.write(line, 0, line.length());
        file.write("\r\n", 0, 2);
      }
      file.close();
      in.close();
    } catch (IOException e) {
			e.printStackTrace();
			System.out.println("I/O Error");
    }
  }
}
