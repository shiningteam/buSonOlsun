package tests;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class Api006PostRequest extends AutomationExerciseBaseUrl01 {

    @Test
    public void US06(){

        spec.pathParam("first", "searchProduct");

        Api006PostRequestPojoClass requestData=new Api006PostRequestPojoClass("Bad request, search_product parameter is missing in POST request.", 400);

        Response response= given().spec(spec).contentType(ContentType.JSON).
                body(requestData). auth().basic("admin", "password123").
                when().post("/{first}");
        // response.prettyPrint();

        Api006PostRequestPojoClass actualDAta= response.as(Api006PostRequestPojoClass.class);
        assertEquals(200, response.getStatusCode());
        assertEquals(requestData.getResponseCode(), actualDAta.getResponseCode());
        assertEquals(requestData.getResponseJSON(), actualDAta.getResponseJSON());
    }
}

