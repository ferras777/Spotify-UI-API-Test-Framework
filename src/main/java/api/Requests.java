package api;

import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class Requests {
    static String api_key = "dict.1.1.20200909T184946Z." +
            "2e1aa1fb548ad146.9405fae8d5de2f6923a8a0d8a3a20123b1608511";


    public static void getLookUp(RequestSpecification requestSpecification, String word) {

        given()
                .param("key", api_key)
                .param("lang", "en-ru")
                .param("text", word)
                .spec(requestSpecification)
                .body("")
                .config(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                        .encodeContentTypeAs("*/*", ContentType.TEXT))).
        when().
                get().
        then().
                assertThat().statusCode(200).
                assertThat().body("def.text[0]", equalTo(word));
    }

    public static void jsonSchemaValidation(RequestSpecification requestSpecification) {
        given()
                .param("key", api_key)
                .param("lang", "en-ru")
                .param("text", "random")
                .spec(requestSpecification)
                .body("")
                .config(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                        .encodeContentTypeAs("*/*", ContentType.TEXT))).
        when().
                get().
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schemaLookUp.json"));
    }
}
