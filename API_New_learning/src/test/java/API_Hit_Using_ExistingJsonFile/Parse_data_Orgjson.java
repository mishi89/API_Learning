package API_Hit_Using_ExistingJsonFile;

import static com.jayway.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class Parse_data_Orgjson {

	public static void main(String[] args) {
		Response res = given().contentType(ContentType.JSON).when()
				.get("http://localhost:3000/StudentDetails");
		JSONArray js  = new JSONArray(res.asString());
		JSONObject obj = js.getJSONObject(0);
	Set<String> allkeys=obj.keySet();

for(String s:allkeys)
{
if(obj.get(s).toString().startsWith("["))
{
JSONArray innearray = new JSONArray("xyz(arrayname)");
System.out.println("Key is" + s + obj.get(s));
}
else
{
System.out.println("Key is " + s +" Value is " + obj.get(s).toString());	
}

}
	}

}
