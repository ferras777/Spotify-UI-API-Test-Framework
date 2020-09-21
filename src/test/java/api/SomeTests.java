package api;

import org.testng.annotations.Test;

public class SomeTests {
    Specifications specifications = new Specifications();

    @Test
    public void statusCodeTest() {
        Requests.getLookUp(specifications.requestSpecificationLookUp, "ball");
    }

    @Test
    public void schemaValidationTest() {
        Requests.jsonSchemaValidation(specifications.requestSpecificationLookUp);
    }
}
