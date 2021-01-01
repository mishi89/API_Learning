package Java_assignemnt;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHnadling {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter path");
		Scanner sc= new Scanner(System.in);
		String path = sc.next();
		File f = new File(path);
		FileReader fr = new FileReader(f);
		int a;
		while ((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}

	}

}
