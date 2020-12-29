package API_Hit_Using_ExistingJsonFile;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class FechAllKeyinforfirstname_inarray {

	public static void main(String[] args) {
		Response res = given().contentType(ContentType.JSON).when()
				.get("http://localhost:3000/StrudentTest");
		
		System.out.println(res.asString());
	/*	JSONArray array = new JSONArray(res.toString());
		 int l = array.length();
		 
		 for(int i=0;i<= l;i++)
		 {
			  JSONObject obj = array.getJSONObject(i);
			  System.out.println(obj.get("lastname").toString());
		 }*/

	}

}
