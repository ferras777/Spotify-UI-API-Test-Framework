package api.specifications;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static api.enums.Endpoints.BASE_URL;
import static api.utils.Authentications.getAccessTokenWithRefreshToken;

public class SpecificUserSpecification {

    //todo why content type any?
    public static RequestSpecification requestSpecificationWithSpecificUser = new RequestSpecBuilder()
            .setBaseUri(BASE_URL.getPath())
            .setPort(443)
            .addHeader("Authorization", "Bearer " + getAccessTokenWithRefreshToken())
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();
}
