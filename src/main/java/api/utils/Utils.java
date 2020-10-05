package api.utils;

import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Utils {

    public void schemaValidation(Response response, String nameOfSchema) {
        response.
                then().
                assertThat().
                body(matchesJsonSchemaInClasspath(nameOfSchema));
    }
}
