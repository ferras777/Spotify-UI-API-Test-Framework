package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class Specifications {

    public static String getToken() {
        return given().
                    param("response_type", "token").
                    param("redirect_uri", "https://developer.spotify.com/callback").
                    param("client_id", "774b29d4f13844c495f206cafdad9c86").
                    param("state", "wcka4f").
                when().
                    get("https://accounts.spotify.com/authorize").
                then().extract().headers().toString();
    }



    String token = "BQCRx74mBFIQBxfS89yzO1akexR1cOZv8q88b3aRuABJSzjErzusYJ7OL5eXToeJft-aZhMueUJXYawcsu95l7EZGjvo8UjC7R7oN_K_KqYhbDgi6_Bxsp0aoPioKwN5dFJeQ2cNmo5YHa3ogJXnhX3X3Q69_3E_OgpknpZup1t9s1cyuez7oS9IEh6QI-Ys_S46wmMjFlmJOfmHRpoyLH-_Kp7_gVmwe-6GrRahc0QuxV8iO1jcuOX4KcknskPYQ65YBM3u6STI1Mt8OUhZPu9LHGqwIYTTHSsL";


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
