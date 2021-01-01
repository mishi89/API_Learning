package Java_assignemnt;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelreadwrite {

	public static void main(String[] args) throws BiffException, IOException {
	File file = new File("C:\\Users\\ss\\Desktop\\Book1.xls");
	Workbook wk = Workbook.getWorkbook(file);
	Sheet sheet = wk.getSheet(0);
	int r = sheet.getRows();
	int c = sheet.getColumns();
	for (int i =0;i<r;i++)
	{
		for(int j=0 ;j<c;j++)
		{
			Cell cell = sheet.getCell(j, i);
			System.out.println(cell.getContents());
		}
	}
	
	
	
	}

}
