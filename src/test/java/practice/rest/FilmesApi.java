package practice.rest;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FilmesApi {

    @Test
    public void getTitles(){
        given()
        .when()
            .get("https://swapi.co/api/films/")
        .then()
            .statusCode(200)
            .body("results.findAll{it.director.equals('George Lucas') && it.producer.contains('Rick McCallum')}.title",
            hasItems("A New Hope", "Attack of the Clones", "The Phantom Menace", "Revenge of the Sith"));
    }

}
