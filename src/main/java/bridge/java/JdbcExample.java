package bridge.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {

            String sql = "dfefefefesf";

            Statement stmt = conn.createStatement();
            stmt.execute(sql);

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
