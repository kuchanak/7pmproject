package commethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelmethod {
	
	static FileInputStream fos;
	static XSSFWorkbook wb;
	static String path = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx";
	public static String readdata(int row , int clm) throws IOException {
		
		 fos=  new FileInputStream(path);
		 wb = new XSSFWorkbook(fos);
		String val1=wb.getSheet("Sheet7").getRow(row).getCell(clm).getStringCellValue();
		return val1;
	}
	
	public static void writedata(int row , int clm , String text) throws IOException {
		fos=  new FileInputStream(path);
		 wb = new XSSFWorkbook(fos);
		wb.getSheet("Sheet7").getRow(row).createCell(clm).setCellValue(text); 
		
		FileOutputStream fis = new FileOutputStream(path);
		wb.write(fis);
		fis.close();
		
		
	}

}
