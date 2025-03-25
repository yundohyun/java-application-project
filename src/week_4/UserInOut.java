package week_4;

import java.io.*;
import java.util.*;

public class UserInOut {
  public static void main(String[] args) {
    ArrayList<User> users = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.print("이름을 입력해주세요 (그만 입력 시 종료) : ");
      String name = in.nextLine();
      if (name.equals("그만")) break;
      System.out.print("나이를 입력해주세요 : ");
      int age = in.nextInt();
      in.nextLine();
      users.add(new User(name, age));
    }

    String content = "";
    for (User user : users) content += (user.toString() + "\n");

    try {
      File file = new File("./src/week_4/assets/user.txt");
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(content);
      bw.close();
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("I/O Error");
    }
      
    System.out.println("파일에 성공적으로 저장하였습니다.");

    in.close();
  }
}
