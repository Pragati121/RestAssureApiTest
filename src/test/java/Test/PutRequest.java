package Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {
    @Test
    public void Put() {
        RequestSpecification request = RestAssured.given();
                request.header("Content-type","application/json");

                JSONObject json= new JSONObject();
                json.put("name","Priya");
               json.put("job","Mann");

request.body(json.toJSONString());
Response response = request.put("https://reqres.in/api/users/2");
int code=response.getStatusCode();
        System.out.println("Put request's status code is"+""+code);
    }
}

