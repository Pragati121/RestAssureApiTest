package Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class PostRequest {
    @Test
        public void test2() {

            JSONObject request = new JSONObject();
            request.put("name", "Pragati");
            request.put("job", "QA");
        System.out.println(request);
        System.out.println(request.toString());
            given().
                    body(request.toJSONString()).
                    when().
                    post("https://reqres.in/api/users").
                    then().statusCode(201 );
        }
}
