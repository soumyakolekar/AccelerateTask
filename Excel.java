package Test1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
			
			public static void main(String[] args) throws IOException {
				File src = new File("C:\\Users\\SOUMYA\\OneDrive\\Documents\\soumyaExcel.xlsx");

				FileInputStream fis= new FileInputStream(src);

				XSSFWorkbook wb = new XSSFWorkbook(fis);

				XSSFSheet sheet1 = wb.getSheetAt(0);

				int rowcount = sheet1.getLastRowNum();

				System.out.println("Total row is " +rowcount+1);

				for(int i=0; i<rowcount;  i++){

				String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();

				System.out.println("Data from Row" +i+  "is"   +data0);
				}
				wb.close();
				}
				}