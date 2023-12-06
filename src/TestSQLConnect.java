import java.sql.*;

public class TestSQLConnect {
    public static void main(String[] args) {
        // JDBC driver name and database URL
        String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=mail_server;encrypt=true;trustServerCertificate=true";
        String username = "haair";
        String password = "12345";


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 2: Establish the connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Step 3: Execute a query
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM MailUser");

            // Step 4: Process the result set
            while (resultSet.next()) {
                String user = resultSet.getString("username");
                String pwd = resultSet.getString("password");
                System.out.println("Username: " + user);
                System.out.println("Password: " + pwd);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        } finally {
            // Step 5: Close the connection and release resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Failed to close the connection.");
                e.printStackTrace();
            }
        }
    }
}
