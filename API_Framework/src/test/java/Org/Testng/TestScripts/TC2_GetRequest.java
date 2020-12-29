package Org.Testng.TestScripts;

import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.response.Response;

import Org.Testng.Teststeps.HTTPmethods;
import Org.Testng.Utilities.Propertoesfileload;

public class TC2_GetRequest {
	
	public void testcase2() throws IOException
	{
		Properties pr = Propertoesfileload.filepath("../API_Framework/Env.properties");
	    HTTPmethods http = new HTTPmethods(pr);
	    Response res= http.getrequest("QA_URI", TC1.id);
	    System.out.println(res.statusCode());
	    System.out.println(res.asString());
	
	}

}
