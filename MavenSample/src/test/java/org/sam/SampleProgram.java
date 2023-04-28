package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleProgram {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\MavenSample\\Excel\\Mavendata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("Data");
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row iteraterow = mySheet.getRow(1);
			for (int j = 0; j < iteraterow.getPhysicalNumberOfCells(); j++) {
				Cell iteratecell = iteraterow.getCell(j);
				System.out.println(iteratecell);
				
			}
			
		}
	}

}
