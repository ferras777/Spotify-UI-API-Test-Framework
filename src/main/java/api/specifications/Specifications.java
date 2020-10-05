package api.specifications;

import api.utils.Utils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    Utils utils = new Utils();

    String token = utils.getProperty("token");

    public RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1")
            .addHeader("Authorization", "Bearer " + token)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();

    public ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .build();
}
