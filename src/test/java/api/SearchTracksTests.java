package api;

import api.asserts.SearchTracksAsserts;
import api.bodies.search_tracks.SearchTrackBody;
import api.requests.SearchTracksRequests;
import api.utils.Utils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SearchTracksTests {

    SearchTracksRequests searchTracksRequests = new SearchTracksRequests();
    SearchTracksAsserts searchTracksAsserts = new SearchTracksAsserts();
    Utils utils = new Utils();

    String trackName = "popular";

    Response response = searchTracksRequests.
            searchForTracks(trackName);

    @Test(description = "Search track schema validation")
    public void searchTrackSchemaValidation() {
        utils.schemaValidation(response, "SearchTrackSchema.json");
    }

    @Test(description="Search track")
    public void searchTrack() {
        SearchTrackBody searchTrackBody = response.as(SearchTrackBody.class);

        searchTracksAsserts.checkTrackNameContainsSearchString(searchTrackBody, trackName);
    }
}
