package tests;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
/*
        Given
            1) https://automationexercise.com/api/verifyLogin

        When
            I send POST Request to the Url
        Then
            Status code is 200
            And body contains email,password as parameters
            And response code should be 200
            And response message should be "User exists!"
 */

public class Api007PostRequest extends AutomationExerciseBaseUrl01 {
    @Test
    public void api7(){
        //Set the url
        spec.pathParam("first","verifyLogin");


        //Set the expected data
        //Send the request get the response
        Response response=given().spec(spec).when().post("/{first}");

        response.prettyPrint();

        //Do assertion
        response.then().assertThat().statusCode(200);

    }

}