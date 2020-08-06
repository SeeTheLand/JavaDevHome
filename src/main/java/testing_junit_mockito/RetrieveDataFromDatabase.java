package testing_junit_mockito;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RetrieveDataFromDatabase {

    public static String getDatabase() {
        String database = "jdbc:postgresql://localhost:5432/product_store";
        return database;
    }

    public static String getUser() {
        String user = "postgres";
        return user;
    }

    public static String getPassword() {
        String password = "Fedor7777777";
        return password;
    }

    public ResultSet getData(String query) {
        try (Connection con = DriverManager.getConnection(getDatabase(), getUser(), getPassword());
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {
             return rs;

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(RetrieveDataFromDatabase.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            return null;
        }
    }
}