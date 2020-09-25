package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    String token = "BQCfKitIGdsOxC6kRNzve38ly8hZYcC1DxpdkGMAj-fxMx_RxcP_N4A2Rr-Sf-Y-1HhYgwgz8DU7-RA_-g938ZqAhco_qrXSP" +
            "KY8xCR8mMBMfbS0cMl9cZuFuIsQB4b-oMKHNWTwTvixqR9QfD7Ck_THBpdvW6FnftO-l5ykOEE5sFphqdpp5cFFxraHCKfh25Eh55ahD" +
            "UFU-ZPDM_kJ23wWih14CN4LHQE2jOz8ExxnDX3TlcJV3X_RQxMWNkR9ZdDoOTw18gmPc5uxreEPMfmFGRf6IsIhuq5-";


    public RequestSpecification searchTracks = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1/search")
            .addHeader("Authorization", "Bearer " + token)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();

    public RequestSpecification getAnArtist = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1/artists/")
            .addHeader("Authorization", "Bearer " + token)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();

    public ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .log(LogDetail.ALL)
            .build();
}
