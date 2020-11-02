package api.negative;

import api.requests.ArtistRequests;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static api.asserts.ArtistApiAssertions.checkResponseBodyErrorMessage;

public class ArtistNegativeTests {

    ArtistRequests artistRequests = new ArtistRequests();

    @Epic(value = "Артист")
    @Feature(value = "Проверка артиста через API")
    @Story(value = "Проверка ответа сервера при неправильном ID")
    @Test(description="Check status code with wrong id of artist")
    public void checkMessageErrorWithWrongIdOfArtist() {
        checkResponseBodyErrorMessage(artistRequests.getArtistWithWrongId());
    }
}
