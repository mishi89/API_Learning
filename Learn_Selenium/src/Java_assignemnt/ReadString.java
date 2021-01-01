package Java_assignemnt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadString {
	public static void main(String[] args) throws IOException {
		File file= new File("../Learn_Selenium/file.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fr);
		String s;
		while ((s=bufferedReader.readLine())!=null)
		{
			System.out.print(s);
		}
	}

}
