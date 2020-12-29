package Org.Trigger;

import java.io.IOException;

import Org.Testng.TestScripts.TC1;
import Org.Testng.TestScripts.TC2_GetRequest;
import Org.Testng.TestScripts.TC4_deleterequest;

public class TriggerShoot {

	public static void main(String[] args) throws IOException {
		TC1 tc1 = new TC1();
		tc1.testcase1();
		TC2_GetRequest gc2 = new TC2_GetRequest();
		gc2.testcase2();
TC4_deleterequest tc4 = new TC4_deleterequest();
tc4.deleterequest();
	}

}
