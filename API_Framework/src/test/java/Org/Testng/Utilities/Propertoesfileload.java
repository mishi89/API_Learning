package Org.Testng.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertoesfileload {
	
	public static Properties filepath(String Path) throws IOException
	{
		File file = new File(Path);
	FileInputStream fi = new FileInputStream(file);
		Properties pr  = new Properties();
		pr.load(fi);
		return pr;
	}

}
