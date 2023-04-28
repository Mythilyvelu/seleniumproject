package org.all;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multidd {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\Multidatadriven\\Excel\\Multidata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
			Row r = mysheet.getRow(i);
			for (int j = 0;  j<r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if (cellType==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
					
				}else if (DateUtil.isCellDateFormatted(c)) {
					Date dd = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
					String value = s.format(dd);
					System.out.println(value);
					
				}
				
				else {
					double d = c.getNumericCellValue();
					long l = (long)d;
					String value = String.valueOf(l);
					System.out.println(value);
					
				}
				
				
				
			}
			
		}
		
			
		}
		
	
		
	}


