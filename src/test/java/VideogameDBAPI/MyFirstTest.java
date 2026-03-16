package VideogameDBAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MyFirstTest {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
                .when()
                .get("https://videogamedb.uk/api/videogame")
                .then()
                .log().all();

    }
}