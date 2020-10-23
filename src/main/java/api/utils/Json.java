package api.utils;
import api.bodies.json.JsonData;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@SuppressWarnings("deprecation")
public class Json {

    public static Object[][] getArtistsDataFromJson() throws FileNotFoundException {
        return getDataFromJson("artists");
    }

    public static Object[][] getArtistsDataFromJson(int amount) throws FileNotFoundException {
        return getDataFromJson("artists", amount);
    }

    public static Object[][] getTracksDataFromJson() throws FileNotFoundException {
        return getDataFromJson("tracks");
    }

    public static Object[][] getTracksDataFromJson(int amount) throws FileNotFoundException {
        return getDataFromJson("tracks", amount);
    }

    private static Object[][] getDataFromJson(String jsonFileName, int amount) throws FileNotFoundException {
        JsonElement jsonData = new JsonParser()
                .parse(new FileReader("src/main/resources/"+ jsonFileName + ".json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get(jsonFileName);
        List<JsonData> testData = new Gson().fromJson(dataSet, new TypeToken<List<JsonData>>() {
        }.getType());
        Object[][] returnValue = new Object[testData.size() - (testData.size() - amount)][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }

    private static Object[][] getDataFromJson(String jsonFileName) throws FileNotFoundException {
        JsonElement jsonData = new JsonParser()
                .parse(new FileReader("src/main/resources/"+ jsonFileName + ".json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get(jsonFileName);
        List<JsonData> testData = new Gson().fromJson(dataSet, new TypeToken<List<JsonData>>() {
        }.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }
}
