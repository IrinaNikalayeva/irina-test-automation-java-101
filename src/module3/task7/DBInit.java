package module3.task7;

import java.sql.*;


public class DBInit {

    Connection connection = null;
    private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String url = "jdbc:derby:";
    private static String dbName = "myDB";

    public DBInit(String dbName) {
        if (!dbExists()) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url + dbName + ";create=true");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private Boolean dbExists() {
        Boolean exists = false;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url + dbName);
            exists = true;
        } catch (Exception e) {

        }
        return (exists);
    }

    public void executeUpdate(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        return result;
    }

}
