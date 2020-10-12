package api;

import api.asserts.SearchTracksAssertions;
import api.bodies.search_tracks.SearchTrackBody;
import api.requests.SearchTracksRequests;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static api.asserts.SchemaValidationAssertions.schemaValidation;

public class SearchTracksTests {

    SearchTracksRequests searchTracksRequests = new SearchTracksRequests();
    SearchTracksAssertions searchTracksAssertions = new SearchTracksAssertions();

    String trackName = "bohemian";

    Response response = searchTracksRequests.
            searchForTracks(trackName);

    @Test(description = "Search track schema validation")
    public void searchTrackSchemaValidation() {
        schemaValidation(response, "SearchTrackSchema.json");
    }

    @Test(description = "Search track", dependsOnMethods = {"searchTrackSchemaValidation"})
    public void searchTrack() {
        SearchTrackBody searchTrackBody = response.as(SearchTrackBody.class);
        searchTracksAssertions.checkTrackNameContainsSearchString(searchTrackBody, trackName);
    }
}
