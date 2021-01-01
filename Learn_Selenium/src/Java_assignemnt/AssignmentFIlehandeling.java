package Java_assignemnt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AssignmentFIlehandeling {

	public static void main(String[] args) throws IOException 
	{
		AssignmentFIlehandeling as = new AssignmentFIlehandeling();
		as.linenuber("../Learn_Selenium/file.txt", 1,2);

	}
	
	public void linenuber(String path ,int start, int end) throws IOException
	{
		File file = new File(path);
		FileReader file1 = new FileReader(file);
		BufferedReader bwr = new BufferedReader(file1);
		String s;
		int num =0 ;
		while((s=bwr.readLine())!=null)
		{
			//
			//num=num+1;
			if(num<start && num < end)
			{
				System.out.println(s);
				break;
			}
		
			}
		}
		

		
	}


