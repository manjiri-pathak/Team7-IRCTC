package utilities;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Sheet;

public class ShipmentTest {
	String[][] data;
	ReadExcel readex =new ReadExcel();
	public static Sheet sh;
	
//HOME PAGE DATA
public String[][] getHome()  {
	String filePath="D:\\IRCTC EXCEL DATA";
	String fileName="HomePage.xlsx";
	String sheetName="Sheet1";
	
	try {
	sh=readex.readExcel(filePath, fileName, sheetName);
	}catch(Exception e) {}
	
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

//TRAIN PAGE DATA
public String[][] getTrain()  {
	String filePath="D:\\IRCTC EXCEL DATA";
	String fileName="HomePage.xlsx";
	String sheetName="Sheet1";
	
	try {
		sh=readex.readExcel(filePath, fileName, sheetName);
		}catch(Exception e) {}
	
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
	
//HOTEL PAGE DATA
public String[][] getHotel()  {
		String filePath="D:\\IRCTC EXCEL DATA";
		String fileName="HotelPage.xlsx";
		String sheetName="Sheet1";
		
		try {
			sh=readex.readExcel(filePath, fileName, sheetName);
			}catch(Exception e) {}
		
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

//FLIGHT PAGE DATA
public String[][] getFlight()  {
		String filePath="D:\\IRCTC EXCEL DATA";
		String fileName="Flight.xlsx";
		String sheetName="Sheet1";
		
		try {
			sh=readex.readExcel(filePath, fileName, sheetName);
			}catch(Exception e) {}
		
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

//BUS PAGE DATA
public String[][] getBus()  {
		String filePath="D:\\IRCTC EXCEL DATA";
		String fileName="BusPage.xlsx";
		String sheetName="Sheet1";
		
		try {
			sh=readex.readExcel(filePath, fileName, sheetName);
			}catch(Exception e) {}
		
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

//HOLIDAY PAGE DATA
public String[][] getHoliday()  {
		String filePath="D:\\IRCTC EXCEL DATA";
		String fileName="HolidaysPage.xlsx";
		String sheetName="Sheet1";
		
		try {
			sh=readex.readExcel(filePath, fileName, sheetName);
			}catch(Exception e) {}
		
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

//PANTRY PAGE DATA
public String[][] getPantry()  {
		String filePath="D:\\IRCTC EXCEL DATA";
		String fileName="Pantry.xlsx";
		String sheetName="Sheet1";
		try {
			sh=readex.readExcel(filePath, fileName, sheetName);
			}catch(Exception e) {}
		
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

//PANTRY PAGE DATA
public String[][] getEcatering() throws InvalidFormatException, IOException {
		String filePath="D:\\IRCTC EXCEL DATA";
		String fileName="Ecatering.xlsx";
		String sheetName="Sheet1";
		
		sh=readex.readExcel(filePath, fileName, sheetName);
		
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
	
}
