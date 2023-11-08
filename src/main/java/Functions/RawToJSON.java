package Functions;

import io.restassured.path.json.JsonPath;

public class RawToJSON {
    public static JsonPath RawToJson(String res){
        JsonPath js = new JsonPath(res);
        return js;
    }
}
