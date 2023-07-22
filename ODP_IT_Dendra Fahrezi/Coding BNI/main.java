import java.sql.*;
import java.sql.Connection;
import java.util.Date;

public class DatabaseODP_BNI{
    private static String Database_URL = "jdbc:mysql://localhost:3306/ODP_BNI_database"

}

private static String encryptPassword (String password){
    return password;
}
private static String boolean isValidEmail(String email){
    return email.match("[name_email]+@[provider]+.[domain]")
}

public static void main(String [] args){
    try {
        Connection conn = DriverManager.getConnection(Database_URL)

        String insertLoginSQL = "INSERT INTO login (username, password, last_login) VALUES (?, ?, ?)"
        String username = "admin";
        String password = "112233abc";
        String encryptPassword = encryptPassword(password);
        PreparedStatement insertLoginStmt = conn.prepareStatement(insertLoginSQL);
        insertLoginStmt.setString(1, username);
        insertLoginStmt.setString(2, encryptPassword);

        String insertCustomerSQL = "INSERT INTO customer (customer_id, first_name, last_name, address, dob, username, email_address) VALUES (?, ?, ?, ?, ?, ?, ?)"
        String email = "admin22@example.com"
        String dobStr = "2000-01-01"
        PreparedStatement insertCustomerStmt = conn.prepareStatement(insertCustomerSQL);
        insertCustomerStmt.setInt(1, 1232);
        insertCustomerStmt.setString(2, "Dendra");
    }
}