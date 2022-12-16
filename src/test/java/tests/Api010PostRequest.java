package tests;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Api010PostRequest extends AutomationExerciseBaseUrl01 {

            /*
           Given
               1) https://automationexercise.com/api/verifyLogin

           When
               User sends a body that contains invalid parameters: email, password
           Then
               HTTP Status Code should be 404
           And
               Response message "User not found!"

            */

    @Test

    public void postCreateAccount() {

        spec.pathParam("first", "verifyLogin");

        //Set the expected data
        //Send the request get the response
        Response response=given().spec(spec).when().post("/{first}");

        response.prettyPrint();

        //Do assertion
        response.then().assertThat().statusCode(404);
    }
}
