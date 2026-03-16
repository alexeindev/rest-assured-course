package VideogameDBAPI.config;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class TestConfig {
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://videogamedb.uk/";
        RestAssured.basePath =  "/api/v2";
    }

}
