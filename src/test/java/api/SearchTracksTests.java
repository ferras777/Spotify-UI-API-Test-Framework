package api;

import api.bodies.artist.ArtistBody;
import api.bodies.search.SearchArtistBody;
import api.bodies.search.SearchTrackBody;
import api.bodies.track.TrackBody;
import api.requests.SearchRequests;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class SearchTracksTests {

    SearchRequests searchRequests = new SearchRequests();

    @DataProvider
    public Object[][] searchKeyWords() {
        return new Object[][]{
                {"All"},
                {"Save"},
                {"Me"}
        };
    }

    HashMap<String, String> hash = new HashMap<>();

    @Test(description = "Search track", dataProvider = "searchKeyWords")
    public void searchArtist(String keyword) {
        Response response = searchRequests.
                searchForArtist(keyword);
        SearchArtistBody searchArtistBody = response.as(SearchArtistBody.class);
        for(ArtistBody artistBody: searchArtistBody.getArtists().getItems()) {
            hash.put(artistBody.getName(), artistBody.getId());
        }
    }

    @Test(description = "Search track", dataProvider = "searchKeyWords", enabled = false)
    public void searchTrack(String keyword) {
        Response response = searchRequests.
                searchForTracks(keyword);
        SearchTrackBody searchTrackBody = response.as(SearchTrackBody.class);
        for(TrackBody trackBody: searchTrackBody.getTracks().getItems()) {
            System.out.println(trackBody.getId());
            System.out.println(trackBody.getName());
            hash.put(trackBody.getName(), trackBody.getId());
        }
    }

    @Test(description="to json")
    public void toJson() throws IOException {
        try (Writer writer = new FileWriter("C:\\Users\\ferra\\IdeaProjects\\test_api\\src\\main\\resources\\artists1" +
                ".json")) {
            Gson gson = new Gson();
            JsonWriter jsonWriter= gson.newJsonWriter(writer);

            jsonWriter.beginObject();
            jsonWriter.name("tracks");
            jsonWriter.beginArray();
            for (String key : hash.keySet()) {
                String value = hash.get(key);
                jsonWriter.beginObject();
                jsonWriter.name("name");
                jsonWriter.value(key);
                jsonWriter.name("id");
                jsonWriter.value(value);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        }
    }
}
