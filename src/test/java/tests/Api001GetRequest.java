package tests;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Api001GetRequest extends AutomationExerciseBaseUrl01 {

    /*
            Given
                  https://automationexercise.com/api/productsList
            When
                  User sends a GET Request to the url
            Then
                  HTTP Status Code should be 200
            And
                  Content Type should be application/json
     */


        @Test
        public void Api001GetRequest(){


            //Set the url
            spec.pathParam("first","productsList");


            //Set the expected data


            //Send the request and get the response
            Response response=given().spec(spec).accept(ContentType.JSON).when().get("/{first}");
            response.prettyPrint();


            //Do assertion
            response.then().assertThat().statusCode(200).contentType(ContentType.JSON);

        }
    }



