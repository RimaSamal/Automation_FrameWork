package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {
	/**
	 * This method takes SheetName,rowIndex,column index as an argument and return value present in the cell
	 * @param SheetName
	 * @param rowIndex
	 * @param collndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getstringDataFromExcel(String SheetName,int rowIndex,int collndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScrptData.xlsx");
		 Workbook Workbook = WorkbookFactory.create(fis);
		 return Workbook.getSheet(SheetName).getRow(rowIndex).getCell(collndex).getStringCellValue();
		 
	}
	
	public  boolean getBooleanDataFromExcel1(String SheetName,int rowIndex,int collndex) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScrptData.xlsx");
		Workbook Workbook = WorkbookFactory.create(fis);
  return Workbook.getSheet(SheetName).getRow(rowIndex).getCell(collndex).getBooleanCellValue();
		 }
	public double getNumberDataFromExcel(String SheetName,int rowIndex,int collndex) throws EncryptedDocumentException, IOException{
		
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScrptData.xlsx");
	Workbook Workbook = WorkbookFactory.create(fis);
	return Workbook.getSheet(SheetName).getRow(rowIndex).getCell(collndex).getNumericCellValue();
		
	}
	
	}


