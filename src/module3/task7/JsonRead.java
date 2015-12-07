package module3.task7;

import com.google.gson.Gson;
import module3.task3.Flower;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class JsonRead implements JsonInterface {

    public void jsonReader(String fileName) throws IOException {
        FileReader responseJSON = new FileReader(fileName);
        Flower[] placelist;
        Gson gson = new Gson();
        placelist = gson.fromJson(responseJSON, Flower[].class);
        System.out.println(Arrays.toString(placelist));
    }

    @Override
    public void createJson() throws IOException {

    }
}




