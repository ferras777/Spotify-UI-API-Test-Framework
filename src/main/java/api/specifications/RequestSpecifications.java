package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static api.utils.Authentications.getAccessTokenNonSpecificUserAsString;
import static api.utils.Properties.getBaseUrl;
import static api.utils.Properties.getPort;

public class RequestSpecifications {

    public static RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(getBaseUrl())
            .setPort(getPort())
            .addHeader("Authorization", "Bearer " + getAccessTokenNonSpecificUserAsString())
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.TEXT)
            .build().config(RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig()));
}
