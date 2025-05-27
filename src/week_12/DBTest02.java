package week_12;

import java.sql.*;

public class DBTest02 {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "password");
      Statement state = connection.createStatement();
      ResultSet result = state.executeQuery("select * from student");
      while (result.next()) {
        System.out.println(result.getString(1));
        System.out.println(result.getString(2));
        System.out.println(result.getString(3));
      }
      result.close();
      state.close();
      connection.close();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}