package Org.Testng.TestScripts;

import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.response.Response;

import Org.Testng.Teststeps.HTTPmethods;
import Org.Testng.Utilities.JsonfileRead;
import Org.Testng.Utilities.Propertoesfileload;

public class TC4_deleterequest {

	public void deleterequest() throws IOException
	{
		Properties pr = Propertoesfileload.filepath("../API_Framework/Env.properties");
		//  String bodaydata =JsonfileRead.jsonloadFile("../API_Framework/src/test/java/Org/Testng/payload/Bodydata.json");
		 HTTPmethods http = new HTTPmethods(pr);
		    Response res= http.deleterequest("QA_URI",TC1.id);
		    System.out.println(res.statusCode());
		    System.out.println(res.asString());
		    System.out.println("delete successfully");
	}
}
