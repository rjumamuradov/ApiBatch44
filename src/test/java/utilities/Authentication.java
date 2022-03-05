package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static  String generateToken(){
            String usarname="Batch44";
            String password="Batch44+";
        Map<String,Object> map=new HashMap<>();
        map.put("Batch44",usarname);
        map.put("Batch44+",password);
        String endPoint = "http://www.gmibank.com/api/authenticate";
        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        return null;
    }
}
