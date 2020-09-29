package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    String token = "BQBIgibizZCQTKw7GAyq58StJBFMUyNLa2-DoMqNBjRFFyRbeyTsg5aV2oKpnf7TVFmpPjnomhVy7ow08Qfphyc1FkFmJelJ" +
            "wk0Ao1_qLodzMgmJhls_5UIWMwvJttGt3jM96CLleYHli8VWj4oXCuxyXSdGQkobCo1rC0Fyym1LdsquPMT_JyJywj39CdCEyndBSMJ" +
            "xLq4Do3TDBih0Cat751u_1rNnPFh10a5IN1Xcpz8Xw6R4htyZ8pcn46_vk27WcKObtQS5VPBQFd-SotOxuhgvS22A6gZn";


    public RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://api.spotify.com/v1")
            .addHeader("Authorization", "Bearer " + token)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.ANY)
            .build();

    public ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .log(LogDetail.BODY)
            .build();
}
