package api;

import api.asserts.SearchTracksAsserts;
import api.bodies.search_tracks.SearchTrackBody;
import api.requests.SearchTracksRequests;
import api.utils.Utils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

//TODO static import
//TODO fix tests
public class SearchTracksTests {

    SearchTracksRequests searchTracksRequests = new SearchTracksRequests();
    SearchTracksAsserts searchTracksAsserts = new SearchTracksAsserts();

    String trackName = "bohemian";

    Response response = searchTracksRequests.
            searchForTracks(trackName);

    @Test(description = "Search track schema validation")
    public void searchTrackSchemaValidation() {
        Utils.schemaValidation(response, "SearchTrackSchema.json");
    }

    @Test(description = "Search track", dependsOnMethods = {"searchTrackSchemaValidation"})
    public void searchTrack() {
        SearchTrackBody searchTrackBody = response.as(SearchTrackBody.class);

        searchTracksAsserts.checkTrackNameContainsSearchString(searchTrackBody, trackName);
    }
}
