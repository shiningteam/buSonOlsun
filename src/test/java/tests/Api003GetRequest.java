package apitest;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Api003GetRequest extends AutomationExerciseBaseUrl01 {

    /*

        Given
             https://automationexercise.com/api/brandsList
        When
            User sends a GET Request to the url
        Then
           Response Code should be 200
        And
            Content Type should be JSON
        And
            Print all brands list

     */

    @Test
    public void get03(){
        //Set the Url
        //String url="https://automationexercise.com/api/brandsList";
        spec.pathParam("first","brandsList");

        //Set the expected data

        //Send the request and get the response
        Response response=given().spec(spec).contentType(ContentType.JSON).when().get("/{first}");
        response.jsonPath().prettyPrint();

        System.out.println("===============");
        //Do Assertion
        response.
                then().
                assertThat().
                statusCode(200).
                contentType("json");
        //body("responseCode",equalTo(200) );


    }
}




