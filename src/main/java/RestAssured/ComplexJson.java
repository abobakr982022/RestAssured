package RestAssured;

import Functions.RawToJSON;
import Functions.ReturnBody;
import io.restassured.path.json.JsonPath;

public class ComplexJson {
    public static void main(String[] args) {
       JsonPath js = RawToJSON.RawToJson(ReturnBody.ComplexResponse());
       int c = js.getInt("courses.size()");
       System.out.println("count " + c);
       System.out.println("website : " +js.getString("dashboard.website"));
        for (int i = 1; i < c+1; i++) {
            System.out.println("title "+i+" : " + js.getString("courses["+i+"].title"));
        }
    }
}
