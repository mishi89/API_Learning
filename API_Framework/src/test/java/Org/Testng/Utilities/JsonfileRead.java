package Org.Testng.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonfileRead {

	public static String jsonloadFile(String path) throws FileNotFoundException
	{
		
		File file = new File(path);
		FileReader filereader = new FileReader(file);
		JSONTokener js  = new JSONTokener(filereader);
		JSONObject jsonobject = new JSONObject(js);
		return jsonobject.toString();
	}

}
