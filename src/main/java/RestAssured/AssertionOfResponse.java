package RestAssured;

import Functions.ReturnBody;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class AssertionOfResponse {
    public static void main(String[] args) {

        //given : all input data
        //when : submit API
        //then : validate on response
        RestAssured.baseURI="https://rahulshettyacademy.com";
       String Response = given().log().all().queryParam("key ","qaclick123").header("Content-Type","application/json")
                .body(ReturnBody.PostBodyContent())
                .when().post("/maps/api/place/add/json")
                .then().assertThat().body("scope", Matchers.equalTo("APP"))
                .header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();

       System.out.println("res: "+Response);
        JsonPath jsonPath = new JsonPath(Response);
        String place_id =jsonPath.getString("place_id");
        System.out.println("place_id: "+place_id);


         String putRes =given().log().all().queryParam("key ","qaclick123").header("Content-Type","application/json")
                .body(ReturnBody.PutBodyContent())
                .when().put("/maps/api/place/update/json")
                .then().assertThat().statusCode(404)
                .header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
         System.out.println("PUT :" +putRes);
         JsonPath jsonPath1 = new JsonPath(putRes);
         String address = jsonPath1.getString("address");
         System.out.println("address : " + address);


    }
}