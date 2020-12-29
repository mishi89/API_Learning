package Org.Testng.Utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtraction {
	public  static String  baseuponextractionclass(Response res ,String jsonpath)
	{
		String extractvalue =res.jsonPath().get(jsonpath);
		return extractvalue;
	}

}
