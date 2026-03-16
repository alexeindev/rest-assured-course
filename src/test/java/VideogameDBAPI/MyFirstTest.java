package VideogameDBAPI;

import VideogameDBAPI.config.TestConfig;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestConfig {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
                .when()
                .get("/videogame")
                .then()
                .log().all();

    }
}