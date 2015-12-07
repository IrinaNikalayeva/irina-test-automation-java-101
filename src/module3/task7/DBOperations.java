package module3.task7;


import module3.task3.FlowerKind;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBOperations implements DBInterface {

    public void writeToDB() {
        DBInit db = new DBInit("myDB");
        try {
            try {
                fillDB(db);
            } catch (SQLException e) {
                db.executeUpdate("CREATE TABLE Flowers (id integer, FlowerName Varchar(20), FlowerPrice int)");
                fillDB(db);
            }
            ResultSet rs = db.executeQuery("SELECT * FROM Flowers");
            while (rs.next()) {
                System.out.println(
                        "id = " + rs.getString(1) + ", FlowerName = " + rs.getString(2) + ", FlowerPrice = " + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void fillDB(DBInit db) throws SQLException {
        ArrayList<FlowerKind> flower = FlowerKind.createflower();
        for (FlowerKind flowerKind : flower) {
            db.executeUpdate("INSERT INTO Flowers (id , FlowerName, FlowerPrice) VALUES(" + flowerKind.getId() + ",'" + flowerKind.getFlowerName() + "'," + flowerKind.getFlowerPrice() + ")");
        }
    }

    public void deleteDB() throws SQLException {
        DBInit db = new DBInit("myDB");
        db.executeUpdate("DROP TABLE Flowers");
    }

    @Override
    public void readFromDB() throws SQLException {

    }
}
