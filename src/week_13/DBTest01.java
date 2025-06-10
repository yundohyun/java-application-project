package week_13;

import java.sql.*;

public class DBTest01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
            PreparedStatement s = c.prepareStatement("insert into student values (?, ?, ?)");

            s.setString(1, "2024005");
            s.setString(2, "엄준식");
            s.setString(3, "방송콘텐츠");
            s.executeUpdate();

            s.setString(1, "2024006");
            s.setString(2, "엄엄준식");
            s.setString(3, "방송콘텐츠");
            s.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
