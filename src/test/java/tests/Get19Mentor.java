package tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class Get19Mentor {
     /*
   Given
       https://automationexercise.com/api/getUserDetailByEmail
   When
       User sends a GET Request to the url
   Then
       "Request Parameters" should be "email"
   And
       Response JSON should be  "User Detail"
   And
       "Response Code" should be 200

       {
        "responseCode": 400,
        "message": "Bad request, email parameter is missing in GET request."
        }
*/

    @Test
    public void Api14(){
        //Set the Url
        String url="https://automationexercise.com/api/getUserDetailByEmail";

        //Set the expected data

        //Send the request and get the response
        Response response=given().when().get(url);
        response.jsonPath().prettyPrint();

        //Do assertion
        assertEquals(200,response.statusCode());

        JsonPath jsonPath=response.jsonPath();
        assertEquals(200,jsonPath.getString("responseCode"));    //jsonPath is object here.
        assertEquals("Bad request, email parameter is missing in GET request.",jsonPath.getString("message"));


    }
}
