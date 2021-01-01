package Java_assignemnt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
	File file= new File("C:\\Users\\ss\\Desktop\\himanshu.txt");
		FileWriter fw= new FileWriter(file, true);
		BufferedWriter bw = new  BufferedWriter(fw);
		bw.write("firstline");
		bw.newLine();
		bw.write("test");
		bw.write("well one");
		bw.close();

	}

}
