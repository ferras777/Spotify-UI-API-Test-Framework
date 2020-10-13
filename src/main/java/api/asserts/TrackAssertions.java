package api.asserts;

import api.bodies.track.TrackBody;

import static org.testng.Assert.assertEquals;

public class TrackAssertions {
    public void checkContentTypeIsAudio(TrackBody trackBody) {
        assertEquals("audio/mpeg", trackBody.getContentTypeofDownloadFile(), "Wrong content type");
    }
}
