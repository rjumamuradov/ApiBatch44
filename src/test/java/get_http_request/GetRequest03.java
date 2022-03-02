package get_http_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest03 {
    @Test
    public void test3(){

        //    https://restful-booker.herokuapp.com/booking/7 url'ine
        //GET request'i yolladigimda
        //gelen response'un
        //status kodunun 200
        //ve content type'inin "application/json"
        //ve firstname'in "Sally"
        //ve lastname'in "Ericsson"
        //ve checkin date'in 2018-10-07"
        //ve checkout date'in 2020-09-30 oldugunu test edin
        //

        String url="https://restful-booker.herokuapp.com/booking/7";
        Response response = given().when().get(url);
        response.prettyPrint();

    }
}
