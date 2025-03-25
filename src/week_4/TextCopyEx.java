package week_4;

import java.io.*;

public class TextCopyEx {
  public static void main(String[] args) {
    File src = new File("./src/week_4/assets/lyrics.txt");
    File dest = new File("./src/week_4/assets/lyrics_copy.txt");
    try {
      int c;
      // String s;
      FileReader fr = new FileReader(src);
      FileWriter fw = new FileWriter(dest);
      BufferedReader br = new BufferedReader(fr);
      BufferedWriter bw = new BufferedWriter(fw);

      // while ((c = fr.read()) != -1) fw.write((char) c); // 문자를 하나 읽고 하나 씀

      while ((c = br.read()) != -1) bw.write((char) c); // 문자를 하나 읽고 하나 씀

      // while ((s = br.readLine()) != null) bw.write(s + "\n"); // 한 줄 읽고 한 줄 씀

      // String line = br.readLine();
      // if (line != null) {
      //   // look-ahead 방식으로 다음 줄이 존재하는지 확인
      //   String prevLine = line;
      //   while ((line = br.readLine()) != null) {
      //     bw.write(prevLine);
      //     bw.write("\n"); // 다음 줄이 존재하므로 개행 문자를 추가
      //     prevLine = line;
      //   }
      //   // 마지막 줄은 개행 문자 없이 출력
      //   bw.write(prevLine);
      // }

      br.close();
      bw.close();
      fr.close();
      fw.close();
      System.out.printf("%s를 %s로 복사하였습니다.%n", src.getPath(), dest.getPath());
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("I/O Error");
    }
  }
}
