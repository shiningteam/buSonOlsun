package tests;


import base_url.AutomationExerciseBaseUrl01;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Api013PutMethod extends AutomationExerciseBaseUrl01 {




    /*
        Given
	        1)  https://automationexercise.com/api/updateAccount
	        2) {
                 "userId": **,
                 "name": "null",
                 "eMail": "null",
                 "password": "null",
                 "title": "null",
                 "birthDate": "null",
                 "birthMonth": "null",
                 "birthYear": "null",
                 "firstName": "null",
                 "lastName": "null",
                 "company": "null",
                 "address1": "null",
                 "address2": "null",
                 "country": "null",
                 "zipcode": "null",
                 "state": "null",
                 "city": "null",
                 "mobileNumber": "null",
               }
        When
	 		I send PUT Request to the Url
	    Then
	   	   Status code is 200
	   	   And response body is like   {
									    "userId": **,
                                        "name": "null",
                                        "eMail": "null",
                                        "password": "null",
                                        "title": "null",
                                        "birthDate": "null",
                                        "birthMonth": "null",
                                        "birthYear": "null",
                                        "firstName": "null",
                                        "lastName": "null",
                                        "company": "null",
                                        "address1": "null",
                                        "address2": "null",
                                        "country": "null",
                                        "zipcode": "null",
                                        "state": "null",
                                        "city": "null",
                                        "mobileNumber": "null",
									   }
     */


    @Test

    public void put13(){
    //set the URL

    spec.pathParam("first","updateAccount");

    //set the expected data

        Api013PutTestData obj = new Api013PutTestData();
        Map<String,Object> expectedData = obj.expectedDataApi13(null,null,null,null,null,null,
                null,null,null,null,null,null,null,null,null,null,null);
        System.out.println("expectedData = " + expectedData);

    //send request get respond

        Response response = given().spec(spec).when().put("/{first}");
        response.jsonPath().prettyPrint();

    //do assertion
        Map<String,Object> actualData = response.as(HashMap.class);
        System.out.println("actualData " + actualData);

    //response.then()

        assertEquals(405, response.statusCode());
        assertEquals(expectedData.get("name") , actualData.get("name"));
        assertEquals(expectedData.get("eMail") , actualData.get("eMail"));
        assertEquals(expectedData.get("password") , actualData.get("password"));
        assertEquals(expectedData.get("title") , actualData.get("title"));
        assertEquals(expectedData.get("birthDate") , actualData.get("birthDate"));
        assertEquals(expectedData.get("birthMonth") , actualData.get("birthMonth"));
        assertEquals(expectedData.get("birthYear") , actualData.get("birthYear"));
        assertEquals(expectedData.get("firstName") , actualData.get("firstName"));
        assertEquals(expectedData.get("lastName") , actualData.get("lastName"));
        assertEquals(expectedData.get("company") , actualData.get("company"));
        assertEquals(expectedData.get("address1") , actualData.get("address1"));
        assertEquals(expectedData.get("address2") , actualData.get("address2"));
        assertEquals(expectedData.get("country") , actualData.get("country"));
        assertEquals(expectedData.get("zipcode") , actualData.get("zipcode"));
        assertEquals(expectedData.get("state") , actualData.get("state"));
        assertEquals(expectedData.get("city") , actualData.get("city"));
        assertEquals(expectedData.get("mobileNumber") , actualData.get("mobileNumber"));

    }

}

