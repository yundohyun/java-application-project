package week_12;

import java.sql.*;

public class DBTest01 {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "password");
      System.out.println("DB 연결 성공!");
      connection.close();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}