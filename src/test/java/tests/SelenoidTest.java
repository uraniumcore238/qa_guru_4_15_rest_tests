package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SelenoidTest {


    @Test
    void SuccessStatusTest(){
        given()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .statusCode(200);



    }



}
