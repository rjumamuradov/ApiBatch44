package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.BeforeClass;


public class RegresinBaseUrl {

    protected RequestSpecification spec01;
    @Before
    public void setUp() {

        spec01=new RequestSpecBuilder().setBaseUri("https://reqres.in/api/users").build();

    }
}
