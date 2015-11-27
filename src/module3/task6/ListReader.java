package module3.task6;


import java.io.*;

public class ListReader {
    public static String read(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();

        ifExists(fileName);

        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String string;
                while ((string = bufferReader.readLine()) != null) {
                    stringBuilder.append(string);
                }
            } finally {
                bufferReader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    private static void ifExists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }


}
