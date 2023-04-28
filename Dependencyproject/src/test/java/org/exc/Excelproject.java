package org.exc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelproject {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\Dependencyproject\\Excel\\Mavendata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		Row ParticularRow = mysheet.getRow(3);
		Cell Particularcell = ParticularRow.getCell(1);
		System.out.println(Particularcell);
		
	}

}
