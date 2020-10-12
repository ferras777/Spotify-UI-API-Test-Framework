package api.asserts;

import api.bodies.track.TrackBody;

import static org.testng.Assert.assertEquals;

public class TrackAssertions {
    public void checkContentTypeIsAudio(TrackBody trackBody) {
        String contentType = trackBody.getContentTypeofDownloadFile();

        assertEquals("audio/mpeg", contentType, "Wrong content type");
    }
}
