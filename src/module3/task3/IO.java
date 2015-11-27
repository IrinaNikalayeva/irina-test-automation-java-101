package module3.task3;

import module3.task6.ListReader;
import module3.task6.ListWriter;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class IO {

    public static void writeFile(ArrayList<FlowerKind> flowers) {
        for (FlowerKind flower : flowers) {
            ListWriter.write("ListOfFlowers.txt", "The list: ", flowers);
        }
    }

    public static void writeComposedBouquet(ArrayList<FlowerKind> bouquetList) {
        ListWriter.write("ComposedBouquet.txt", "Composed :", bouquetList);

    }

    public static String readList(String fileName) throws FileNotFoundException {
        return ListReader.read(fileName).toString();


    }


}
