package RestAssured;

import Functions.RawToJSON;
import Functions.ReturnBody;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Jira2 extends Jira {
    Jira jira2 =new Jira(Jira.res);


    public Jira2(String res) {
        super(res);
    }
    @Test
    public void st(){
        System.out.println(jira2.res);
        System.out.println(new Jira(jira2.res));
        System.out.println("res "+ jira2.getRes());
        System.out.println("session.name "+ RawToJSON.RawToJson(jira2.getRes()).getString("session.name"));

    }
}
