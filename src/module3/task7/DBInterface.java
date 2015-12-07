package module3.task7;

import java.sql.SQLException;

/**
 * Created by Iryna on 12/7/2015.
 */
public interface DBInterface {
    public void writeToDB();

    public void fillDB(DBInit db) throws SQLException;

    public void deleteDB() throws SQLException;

    public void readFromDB() throws SQLException;
}
