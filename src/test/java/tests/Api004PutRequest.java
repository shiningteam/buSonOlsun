package tests;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

    public class Api004PutRequest extends AutomationExerciseBaseUrl01 {


    /*

        Given
           1)  https://automationexercise.com/api/brandsList
            2)        {"responseCode": 200,
                        "brands": [{"id": 11,
                        "brand": "Pol"},
                        {id": 12,
                        "brand": "H&MZ"},
        When

            User sends a PUT Request to the url
        Then
           Status code should be 200
        And
            Body should be like :{"responseCode": 405, "message": "This request method is not supported."}
           */

        @Test
        public void put04(){
            //Set the Url
            spec.pathParam("first","brandsList");
            //String url="https://automationexercise.com/api/brandsList";

            //Set the expected data
            Map<String,Object> expectedData = new HashMap<>();
            expectedData.put("responseCode",200);
            expectedData.put("brands.id","11");
            expectedData.put("brands.brand","Pol");
            expectedData.put("brands.id","12");
            expectedData.put("brands.brand","H&MZ");
            System.out.println("expectedData = " + expectedData);

            //Send the request and get the response
            Response response = given().spec(spec).
                    contentType(ContentType.JSON).
                    body(expectedData).
                    when().put("/{first}");
            response.prettyPrint();



            //Do Assertion

            response.then().assertThat().statusCode(200);



        }




    }





