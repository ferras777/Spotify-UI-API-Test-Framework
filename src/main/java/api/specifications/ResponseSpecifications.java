package api.specifications;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecifications {

    public static ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .log(LogDetail.BODY)
            .build();
}
