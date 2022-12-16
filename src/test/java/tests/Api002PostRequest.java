package tests;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Api002PostRequest extends AutomationExerciseBaseUrl01 {



    /*
           Given accept type is Json
           When user sends post request to "/api/productsList"
           Then status code is 200
           And body should contain "This request method is not supported."
           And body should contain "responseCode": 405"

     */

    @Test
    public void Api002PostRequest(){

        //Set the url
        spec.pathParam("first", "productsList");


        //Set the expected data


        //Send the request and get the response
        Response response = given().spec(spec).contentType(ContentType.JSON).when().post("/{first}");
        response.prettyPrint();


        //Do assertion
        response.then().assertThat().statusCode(200);
        assertTrue(response.body().asString().contains("\"responseCode\": 405, \"message\": \"This request method is not supported.\""));







    }
}
