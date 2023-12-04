package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadingDataFromPropertiesFile {
    
	@Test
	public void vitigercrm() throws IOException
	
	{
		final WebDriver driver;
//		FileInputStream file = new FileInputStream("src\\test\\resources\\Vitigercrm.properties");
//		Properties p = new  Properties();	
//		p.load(file);
//		String BROWSER = p.getProperty("browser");
//		String URL = p.getProperty("url");
//		String USERNAME = p.getProperty("username");
//		String PASSWORD = p.getProperty("password");
//		
//		
//			if (BROWSER.equalsIgnoreCase("Chrome"))
//			{
//				driver = new ChromeDriver();
//			}
//			else if (BROWSER.equalsIgnoreCase("Edge"))
//			{
//				driver = new EdgeDriver();
//			}
//			else 
//			{
//				driver = new FirefoxDriver();
//			}
//			
//			driver.get(URL);
//			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//			driver.findElement(By.id("submitButton")).click();
			
			FileInputStream files =new FileInputStream("src\\test\\resources\\VtigerDDT.xlsx");
			Workbook wb= WorkbookFactory.create(files);
			Sheet sh = wb.getSheet("Sheet1");
			String BROWSER = sh.getRow(0).getCell(1).getStringCellValue();
			String URL = sh.getRow(1).getCell(1).getStringCellValue();
			String USERNAME= sh.getRow(2).getCell(1).getStringCellValue();
			String PASSWORD = sh.getRow(3).getCell(1).getStringCellValue();
			
			if (BROWSER.equalsIgnoreCase("Chrome"))
				{
					driver = new ChromeDriver();
				}
				else if (BROWSER.equalsIgnoreCase("Edge"))
				{
					driver = new EdgeDriver();
				}
				else 
				{
					driver = new FirefoxDriver();
				}
			
			driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
		}
	
	}
	
	

