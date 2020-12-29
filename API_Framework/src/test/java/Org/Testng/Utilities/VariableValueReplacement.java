package Org.Testng.Utilities;

import java.util.regex.Pattern;

public class VariableValueReplacement {
	
	public static String getValue(String body,String Varibalename ,String variablevalue)
	{
		body =body.replaceAll(Pattern.quote("{{"+Varibalename+"}}"), variablevalue);
		return body;
	}

}
