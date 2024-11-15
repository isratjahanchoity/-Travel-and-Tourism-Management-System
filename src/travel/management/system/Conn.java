package travel.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///traveltourmanagementsystem", "root", "israt100?");
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/traveltourmanagementsystem", "root", "");

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
