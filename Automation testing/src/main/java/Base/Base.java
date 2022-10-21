package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	String[][] data;
	public static Sheet s;
	public static Workbook wb;
	public static Sheet sh;
	public static WebDriver driver;
	
	public  WebDriver ChromeDriver() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(chromeOptions);
		 return driver;
	}
	
	//EXCEL
	
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws InvalidFormatException, IOException {
		
		//fill code here
		
		File f= new File(filePath+"\\"+fileName);
		
		// File f = new File(fileName);
		
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet s=wb.getSheet(sheetName);
		return s;
		
	}
	
	public String[][] getData() throws InvalidFormatException, IOException {
		String filePath="D:\\";
		String fileName="IRCTCFIN.xlsx";
		String sheetName="IRCTC";
		
		readExcel(filePath, fileName, sheetName);
		
		int rows= sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		
		
		
		String [][] data = new String [rows][cols];
		DataFormatter df= new DataFormatter();
		for(int i=0	;i<rows;i++) {
		for(int j=0;j<cols;j++) {
		data[i][j]= df.formatCellValue(sh.getRow(i+1).getCell(j));
		}
		
		}
		return data;
	}
	
	//SCREENSHOT
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File(fileWithPath);

        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);

    }
	
	 
}
