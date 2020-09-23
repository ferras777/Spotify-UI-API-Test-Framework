package api;

import api.bodies.ResponseBody;
import org.testng.annotations.Test;

public class SomeTests {
    Specifications specifications = new Specifications();

    @Test
    public void statusCodeTest() {
        ResponseBody response = Requests.getLookUp(specifications.requestSpecificationLookUp, "ball",
                specifications.responseSpecification).as(ResponseBody.class);
    }

    @Test
    public void schemaValidationTest() {
        Requests.jsonSchemaValidation(specifications.requestSpecificationLookUp);
    }
}
