package com.tmb.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	@Test(dataProvider = "getExcelData")
	public void test(Map<String, String> map) throws IOException {
		
		System.out.println("username:"+map.get("username"));
		System.out.println("password:"+map.get("password"));
		System.out.println("firstname:"+map.get("firstname"));
		System.out.println("lastname:"+map.get("lastname"));
	}
	
	
	@DataProvider
	public Object[] getExcelData() throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\madhu\\eclipse-workspace\\selenium\\Testdata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("test");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		
		Object[] data=new Object[lastRowNum];
		Map<String, String> map;
		
		for (int i = 1; i <=lastRowNum; i++) {
			map=new HashMap<String, String>();
			for (int j = 0; j < lastCellNum; j++) {
				
				String key=sheet.getRow(0).getCell(j).getStringCellValue();
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-1]=map;
			}
			
		}
		return data;
		
	}
}







