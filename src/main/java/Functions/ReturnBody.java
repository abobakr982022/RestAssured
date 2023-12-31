package Functions;

public class ReturnBody {
    public static String PostBodyContent(){
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}\n";
    }
    public static String PutBodyContent(){
        return "{\n" +
                "\"place_id\":\"8d2573bdf6ceec0e474c5f388fa917fb\",\n" +
                "\"address\":\"70 Summer walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n";

    }

    public static String ComplexResponse(){
        return "{\n" +
                "\"dashboard\": {\n" +
                "\"purchaseAmount\": 910,\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "},\n" +
                "\"courses\": [\n" +
                "{\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\"price\": 50,\n" +
                "\"copies\": 6\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"Cypress\",\n" +
                "\"price\": 40,\n" +
                "\"copies\": 4\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"RPA\",\n" +
                "\"price\": 45,\n" +
                "\"copies\": 10\n" +
                "}\n" +
                "]\n" +
                "}";
    }

    public static String LibBody(String isbn ,String aisle){
        return "{\n" +
                "            \"name\":\"Learn Appium Automation with Java\",\n" +
                "            \"isbn\":\""+isbn+"\",\n" +
                "            \"aisle\":\""+aisle+"\",\n" +
                "            \"author\":\"John foe\"\n" +
                "    }";

    }
    public static String AuthLogin(){
        return "{\n" +
                "  \"username\": \"abobakrahmed\",\n" +
                "  \"password\": \"Abubakr@12345\"\n" +
                "}";
    }
    public static String issue(){
        return "{\n" +
                "   \n" +
                "    \"fields\": {\n" +
                "        \"project\": {\n" +
                "            \"id\": \"10000\",\n" +
                "            \"key\":\"Bug\"\n" +
                "        },\n" +
                "        \"summary\": \"issue\",\n" +
                "        \"issuetype\": {\n" +
                "            \"name\": \"Bug\"\n" +
                "        }\n" +
                "      \n" +
                "    }\n" +
                "}";
    }




}
