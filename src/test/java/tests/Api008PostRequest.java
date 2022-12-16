package tests;

import base_url.AutomationExerciseBaseUrl01;
import groovy.json.JsonOutput;
import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Api008PostRequest extends AutomationExerciseBaseUrl01 {


        @Test
        public void apiPost08(JsonOutput response) {

            //Set the url
            //https://automationexercise.com/api/verifyLogin
            spec.pathParam("eight", "verifyLogin");

            //Set the expected data
            Map<String, Object> expectedData = new HashMap<>();
            expectedData.put("password", "----");
            System.out.println("expectedData= " + expectedData);

            //Send the request get the response
            given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{eight}");
            //response.prettyPrint();

        }
}
