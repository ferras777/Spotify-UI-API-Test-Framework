package api.asserts;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class SchemaValidationAsserts {

    public static void schemaValidation(Response response, String nameOfSchema) {
        response.
                then().
                assertThat().
                body(matchesJsonSchemaInClasspath(nameOfSchema));
    }
}
