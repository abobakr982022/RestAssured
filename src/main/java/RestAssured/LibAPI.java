package RestAssured;
import static io.restassured.RestAssured.*;

import Functions.RawToJSON;
import Functions.ReturnBody;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibAPI {
    @Test
    public void AddBook(){
        baseURI="http://216.10.245.166";
        String ResLib = given().log().all().body(ReturnBody.LibBody("bakrr","1121")).when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();
        System.out.println("res " + ResLib);
        String Msg = RawToJSON.RawToJson(ResLib).getString("Msg");
        System.out.println("Msg: " + Msg);
        Assert.assertEquals(Msg,"successfully added");
        System.out.println("");
    }
}