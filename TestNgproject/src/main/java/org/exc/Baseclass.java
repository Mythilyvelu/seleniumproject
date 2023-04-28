package org.exc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.security.DomainLoadStoreParameter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	private static final int rowNum = 0;
	private static final int cellNum = 0;
	private static final Date newData = null;
	public static WebDriver driver;

	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}
	public static void WindowMaximize() {
	driver.manage().window().maximize();

	}

	

	

	public void launchurl(String url) {
		driver.get(url);

	}

	public String pagetitle() {
		String title = driver.getTitle();
		return  title;

	}

	public String pageurl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	public void passtext(String txt, WebElement ele) {
		ele.sendKeys(txt);

	}

	public static void closeEntireBrowser() {
		driver.quit();

	}

	public void clickbtn(WebElement ele) {
		ele.click();

	}

	public void screenshot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);

	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();

	}

	public static void dragdrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();

	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarWebEle) {
		js = (JavascriptExecutor) driver;

		js.executeAsyncScript("arguments[0].scrollIntoView(true)", tarWebEle);

	}

	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoview(false)", element);

	}

	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("Excel location.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();

		String value = " ";
		if (cellType == 1) {
			String value2 = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value1 = s.format(dd);

		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueOf = String.valueOf(1);

		}

	}

	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\Dependencyproject\\Excel\\newfile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Datas1");
		Row newRow = newSheet.createRow(rowNum);
		Cell newCell = newRow.createCell(cellNum);
		newCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void createcell(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\Dependencyproject\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Datas1");
		Row r = sheet.getRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createrow(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\Dependencyproject\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Datas1");
		Row r = sheet.createRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public void updateDataToParticularcell(int getTheRow, int getTheCell, String exisitingData, String writeNewData)
			throws IOException {
		File f = new File("C:\\Users\\Sathya Rashmi\\Inmakes\\Dependencyproject\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas1");
		Row r = s.getRow(getTheCell);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(exisitingData)) {
			c.setCellValue(writeNewData);

		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void main(String[] args) throws IOException {
		File f = new File("Excel location.xlxs");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Datas");
		Row newrow = newSheet.createRow(0);
		Cell newcell = newrow.createCell(0);
		newcell.setCellValue("Driven");
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}
	

}
