package api.utils;

import api.bodies.track.TrackBody;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Utils {
    public static void schemaValidation(Response response, String nameOfSchema) {
        response.
                then().
                assertThat().
                body(matchesJsonSchemaInClasspath(nameOfSchema));
    }

    //TODO implement body interface
    public static String getContentTypeofDownloadFile(TrackBody trackBody) {
        return when().
                get(trackBody.getPreview_url()).
                then().
                    extract().
                    contentType();
    }
}
