package Java_assignemnt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileahndling_readwholeline {

	public static void main(String[] args) throws IOException {
File file = new File("../Learn_Selenium/file.txt");
FileReader fr= new FileReader(file);
int t;
while((t=fr.read())!=-1)
{
	System.out.println((char)t);
}

}
}