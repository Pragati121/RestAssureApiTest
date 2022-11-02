package Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GetRequest {
        @Test
        public static void getResponseBody() {
            Response response = RestAssured.get("https://www.weatherapi.com");
            System.out.println("the status code is"+""+response.getStatusCode());
            System.out.println("Time: "+response.getTime());
        }
    public static void main(String[] args) {
        getResponseBody();
    }
    }