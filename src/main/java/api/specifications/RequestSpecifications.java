package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static api.utils.Authentications.*;

public class RequestSpecifications {

    public static RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1")
            .setPort(443)
            .addHeader("Authorization", "Bearer " + getAccessTokenNonSpecificUserAsString())
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();


    public static RequestSpecification requestSpecificationWithSpecificUser = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1")
            .setPort(443)
            .addHeader("Authorization", "Bearer ")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();
}
