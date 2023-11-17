package RestAssured;
import static io.restassured.RestAssured.*;

import Functions.RawToJSON;
import Functions.ReturnBody;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Jira {
    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public static String res;

    public Jira(String res) {
        this.res = res;
    }

    @Test
    public void JIRA() throws IOException {
        SessionFilter session = new SessionFilter();
        Jira jira =new Jira(res);
        baseURI="http://localhost:9191";
        jira.setRes(given().log().all().contentType(ContentType.JSON).body(ReturnBody.AuthLogin()).filter(session)
                .when().post("/rest/auth/1/session")
                .then().log().all().extract().response().asString());
        System.out.println("path " + System.getProperty("user.dir")+"/src/main/java/JIRALogin.json");
        System.out.println("response " + jira.getRes());
        String session_name = RawToJSON.RawToJson(jira.getRes()).getString("session.name");
        String session_value = RawToJSON.RawToJson(jira.getRes()).getString("session.value");
        System.out.println("session_name " + session_name);
       System.out.println("session_value " + session_value);
       Jira jira1 = new Jira2(res);
       jira1.setRes(given().log().all().contentType(ContentType.JSON).body(ReturnBody.issue()).filter(session)
               .when().post("/rest/api/2/issue")
               .then().assertThat().statusCode(201).log().all().extract().response().asString());
       System.out.println("res2 "+ jira1.getRes());

    }

}
