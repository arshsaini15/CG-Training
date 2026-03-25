package Spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Spring {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 2. Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Establish Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CG",
                    "root",
                    "0123456789"
            );

            // 4. Create Statement
            stmt = con.createStatement();

            // 5. Execute Query
            rs = stmt.executeQuery("SELECT * FROM student");

            // 6. Process Results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " - " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}