package module3.task6;

import module3.task3.FlowerKind;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ListWriter {
    public static void write(String fileName, String intro, ArrayList<FlowerKind> text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file.getAbsoluteFile());

            try {
                printWriter.println(intro + text);
            } finally {
                printWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
