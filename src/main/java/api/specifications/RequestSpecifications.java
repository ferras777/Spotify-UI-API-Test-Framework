package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static api.utils.Authentications.getAccessTokenFromProperties;

public class RequestSpecifications {
    private static final String token = getAccessTokenFromProperties();

    public static RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1")
            .setPort(443)
            .addHeader("Authorization", "Bearer " + token)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();
}