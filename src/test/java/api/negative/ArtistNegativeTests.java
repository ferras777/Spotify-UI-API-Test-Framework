package api.negative;

import api.requests.ArtistRequests;
import org.testng.annotations.Test;

import static api.asserts.ArtistApiAssertions.checkResponseBodyErrorMessage;

public class ArtistNegativeTests {

    ArtistRequests artistRequests = new ArtistRequests();

    @Test(description="Check status code with wrong id of artist")
    public void checkMessageErrorWithWrongIdOfArtist() {
        checkResponseBodyErrorMessage(artistRequests.getArtistWithWrongId());
    }
}
