package api.specifications;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.filter.log.LogDetail.BODY;

public class ResponseSpecifications {

    //todo add asserts
    //todo flexible specifications
    public static ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .log(BODY)
            .build();
}
