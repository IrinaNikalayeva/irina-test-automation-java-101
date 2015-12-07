package module3.task7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import module3.task3.FlowerKind;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JsonWriter implements JsonInterface {

    public void createJson() throws IOException {
        ArrayList<FlowerKind> flowerKind = FlowerKind.createflower();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String flower = gson.toJson(flowerKind);
        System.out.println(flower);
        FileWriter fileWriter = new FileWriter("json111.json");
        fileWriter.write(flower);
        fileWriter.close();
        System.out.println(flower);
    }

    @Override
    public void jsonReader(String fileName) throws IOException {

    }
}
