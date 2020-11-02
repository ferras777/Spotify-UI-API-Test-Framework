package api;

import api.bodies.artist.ArtistBody;
import api.bodies.json.JsonData;
import api.listeners.Listener;
import api.requests.ArtistRequests;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static api.asserts.ArtistApiAssertions.checkResponseRightArtistId;
import static api.asserts.ArtistApiAssertions.checkResponseRightArtistName;
import static api.utils.Json.getArtistsDataFromJson;

@Listeners(Listener.class)
public class ArtistTests {

    ArtistRequests artistRequests = new ArtistRequests();

    @DataProvider(parallel = true)
    public Object[][] getDataFromJson() throws FileNotFoundException {
        return getArtistsDataFromJson(1);
    }

    @Epic(value = "Артист")
    @Feature(value = "Проверка артиста через API")
    @Stories(value = {@Story(value = "Проверка имени артиста"),
            @Story(value = "Проверка ID артиста")})
    @Test(description = "Check right name and id of artist", dataProvider = "getDataFromJson")
    public void checkRightNameAndIdArtist(JsonData jsonData) {
        ArtistBody artistBody = artistRequests.getArtistBody(jsonData.getId());
        checkResponseRightArtistId(artistBody, jsonData);
        checkResponseRightArtistName(artistBody, jsonData);
    }
}