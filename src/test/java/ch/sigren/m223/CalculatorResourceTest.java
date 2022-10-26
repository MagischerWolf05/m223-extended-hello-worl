package ch.sigren.m223;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {
    @Test
    public void TestCalculator() {
        given()
          .when().get("/calculator/add/10/20")
          .then()
             .statusCode(200)
             .body(is("30"));
    }
}
