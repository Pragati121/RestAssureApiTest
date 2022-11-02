package Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class DeleteRequest {
    @Test
    public void Delete() {
        RequestSpecification request = RestAssured.given();

        Response response = request.put("https://reqres.in/api/users/2");
        int code = response.getStatusCode();
        System.out.println("Delete request's status code is" + "" + code);

    }
}
