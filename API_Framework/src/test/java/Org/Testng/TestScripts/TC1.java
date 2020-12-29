package Org.Testng.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;

import com.jayway.restassured.response.Response;

import Org.Testng.Teststeps.HTTPmethods;
import Org.Testng.Utilities.JsonfileRead;
import Org.Testng.Utilities.Propertoesfileload;
import Org.Testng.Utilities.ResponseExtraction;
import Org.Testng.Utilities.VariableValueReplacement;

public class TC1 {
 static String id;
	public void testcase1() throws IOException {
		Properties pr = Propertoesfileload.filepath("../API_Framework/Env.properties");
		  String bodaydata =JsonfileRead.jsonloadFile("../API_Framework/src/test/java/Org/Testng/payload/Bodydata.json");
			Random random = new Random();
			Integer no = random.nextInt();
			 
			bodaydata=VariableValueReplacement.getValue(bodaydata, "id",no.toString() );	
	HTTPmethods http = new HTTPmethods(pr);
	Response res = http.postmethod("QA_URI",bodaydata);
	System.out.println(res.statusCode());
	System.out.println(res.asString());
	id = ResponseExtraction.baseuponextractionclass(res, "id");
	System.out.println(id);
	}

}
