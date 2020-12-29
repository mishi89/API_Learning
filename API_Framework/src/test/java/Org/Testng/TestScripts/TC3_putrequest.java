package Org.Testng.TestScripts;

import java.io.IOException;
import java.util.Properties;

import Org.Testng.Utilities.JsonfileRead;
import Org.Testng.Utilities.Propertoesfileload;

public class TC3_putrequest {
	public void testCase3_putreq() throws IOException
	{
	Properties pr = Propertoesfileload.filepath("../API_Framework/Env.properties");
	  String bodaydata =JsonfileRead.jsonloadFile("../API_Framework/src/test/java/Org/Testng/payload/Bodydata.json");

	}
}