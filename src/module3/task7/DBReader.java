package module3.task7;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DBReader implements DBInterface {


    @Override
    public void writeToDB() {

    }

    @Override
    public void fillDB(DBInit db) throws SQLException {

    }

    @Override
    public void deleteDB() throws SQLException {

    }

    public void readFromDB() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the flower's id to display it");
            int l = scanner.nextInt();
            DBInit dbInit = new DBInit("MyDB");
            ResultSet result = dbInit.executeQuery("SELECT * FROM Flowers WHERE id = " + l);
            while (result.next()) {
                System.out.println(
                        "id = " + result.getString(1) + ", FlowerName = " + result.getString(2) + ", FlowerPrice = " + result.getString(3));
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong id!");
        }
    }
}
