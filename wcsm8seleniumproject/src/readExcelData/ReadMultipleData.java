package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData
{
	//read the data from IPL sheet

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	for(int i=1; i<=10;i++)
	{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsm");//provide the path of sheet
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into sheet
		Row Row = sheet.getRow(i);//get into desired row
		Cell cell = Row.getCell(0);//
		String data = cell.getStringCellValue();
		Thread.sleep(2000);
        System.out.println(data);
		
	}

	}

}
