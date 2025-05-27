package week_12;

import java.sql.*;

public class DBTest03 {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "password");
      Statement state = connection.createStatement();
      // String query = "insert into student values ('20240006', '신지환', '왈랄랄루')";
      // String query = "update student set dept = '왈랄루' where name = '신지환'";
      String query = "delete from student where name = '신지환'";
      state.executeUpdate(query);
      state.close();
      connection.close();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}