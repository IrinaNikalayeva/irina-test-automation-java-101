package module3.task7;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class RunnerTask7 {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner scanner = new Scanner(System.in);
        DBOperations dbOperations = new DBOperations();
        DBReader dbReader = new DBReader();
        JsonRead jsonRead = new JsonRead();
        JsonWriter jsonWriter = new JsonWriter();
        System.out.println("The following json has been created: " + "\n");
        jsonWriter.createJson();
        System.out.println("Now lets read from the json file: " + "\n");
        jsonRead.jsonReader("json111.json");
        System.out.println("Lets continue with database: " + "\n");
        System.out.println("The following database has been created: " + "\n");
        dbOperations.writeToDB();
        System.out.println("Now lets read from the DB: " + "\n");
        dbReader.readFromDB();
        System.out.println("Do you want to clear the database? Press y if you do " + "\n");
        if (scanner.next().equals("y")) {
            dbOperations.deleteDB();
            System.out.println("The database has been deleted");
        } else {
            System.out.println("As you wish");
        }
    }
}
