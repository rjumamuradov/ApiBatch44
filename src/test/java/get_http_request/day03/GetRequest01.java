package get_http_request.day03;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {



    @Test
    public void test01(){

        String url="https://restful-booker.herokuapp.com/booking/";
        Response response= given().when().get(url);
        response.prettyPrint();
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.contentType() = " + response.contentType());
        System.out.println("response.time() = " + response.time());
        System.out.println("response.statusLine() = " + response.statusLine());
        Assert.assertEquals(200,response.statusCode());
       Assert.assertEquals("application/json; charset=utf-8",response.contentType());
       Assert.assertEquals("HTTP/1.1 200 OK",response.statusLine());
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8");


    }

}
