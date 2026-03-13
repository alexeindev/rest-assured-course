package rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestJsonPlaceholderAPI {
    @Test
    public void getAllPost() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/posts")
        .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }
}
