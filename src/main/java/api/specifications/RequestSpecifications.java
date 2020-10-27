package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static api.enums.Endpoints.BASE_URL;
import static api.utils.Authentications.getAccessTokenNonSpecificUserAsString;

public class RequestSpecifications {

    //todo why content type any?
    //todo move port to config
    public static RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(BASE_URL.getPath())
            .setPort(443)
            .addHeader("Authorization", "Bearer " + getAccessTokenNonSpecificUserAsString())
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .log(LogDetail.ALL)
            .build();
}
