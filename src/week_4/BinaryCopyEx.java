package week_4;

import java.io.*;

public class BinaryCopyEx {
  public static void main(String[] args) {
    File src = new File("./src/week_4/assets/image.png");
    File dest = new File("./src/week_4/assets/image_copy.png");
    try {
      FileInputStream fr = new FileInputStream(src);
      FileOutputStream fw = new FileOutputStream(dest);
      BufferedInputStream br = new BufferedInputStream(fr);
      BufferedOutputStream bw = new BufferedOutputStream(fw);
      bw.write(br.readAllBytes());
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
