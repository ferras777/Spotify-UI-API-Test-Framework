package api.utils;

import api.bodies.common.CommonBody;

import static io.restassured.RestAssured.when;

public class Utils {
    //TODO implement body interface
    public static String getContentTypeofDownloadFile(CommonBody body) {
        return when().
                get(body.getPreview_url()).
                then().
                    extract().
                    contentType();
    }
}
