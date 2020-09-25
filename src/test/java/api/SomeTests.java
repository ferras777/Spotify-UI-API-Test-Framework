package api;

import api.bodies.artist.ArtistBody;
import api.requests.Requests;
import api.specifications.Specifications;
import org.testng.annotations.Test;

public class SomeTests {

    Specifications specifications = new Specifications();
    ArtistBody artistBody = new ArtistBody();

    // TODO: problem with deserialization
    @Test(description = "Get information about artist")
    public void getInformationAboutArtist() {
        Requests.
                getAnArtist("0TnOYISbd1XYRBk9myaseg",
                        specifications.getAnArtist,
                        specifications.responseSpecification).as(ArtistBody.class);

    }

    @Test(description = "Search track schema validation")
    public void searchTrackSchemaValidation() {
        Requests.
                schemaValidation(specifications.searchTracks, specifications.responseSpecification);
    }
}
