package Org.Testng.Teststeps;

import java.util.Properties;

import org.json.JSONObject;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPmethods {
	Properties pr ;

	public HTTPmethods(Properties pr)
	{
		this.pr =pr;
	}
	public Response postmethod(String urikey ,String body)
	{
		Response res =given().
		contentType(ContentType.JSON).
		when().
		body(body).
		post(pr.getProperty(urikey));
		return res;
	}

	public Response getrequest(String urikey, String id) {

		 String uri = pr.getProperty(urikey)+"/"+id;
		Response res =given().
		contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
	}
	/*public Response putrequest(String urikey,String body)
	{
		JSONObject obj = new JSONObject();
		obj.put("Name", "mishra");
		Response res = given()
				.contentType(ContentType.JSON)
				.when()*/
	/*			.body(body)
				.put(pr.getProperty(urikey));
		return res;*/
	//}
	public Response deleterequest(String urikey,String id) {

		 String uri1 = pr.getProperty(urikey)+"/"+id;
		Response res =given().
		contentType(ContentType.JSON)
		.when()
	.delete(uri1);
		return res;
	}
}
