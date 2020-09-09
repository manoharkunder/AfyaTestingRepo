package com.niveus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.collections.Lists;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Base {
	public File file;
	public FileInputStream inputStream;
	public Workbook workbook = null;
	public Sheet sheet;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;
	
	static int passedCount = 0;
	static int failureCount = 0;
	static int skippedCount = 0;
	
	public WebDriver driver;
	public static WebDriver sdriver;
	FileLib lib = new FileLib();
	
	public static void main(String[] args) {
        
		 List<String> suites = Lists.newArrayList();         
	       TestListenerAdapter tla = new TestListenerAdapter();
	       TestNG testng = new TestNG();
	       suites.add("testng.xml");
	       testng.setTestSuites(suites);
	       testng.addListener(tla);
	       testng.run();
	}
	@BeforeTest
	
 public void readAndWriteexcel() throws IOException {
		
		//EXTENT REPORT
		
		htmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Report/AutomationReport.html"));
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/Report/ExtentConfigFile.xml"));
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Operating System", "Windows");
		extent.setSystemInfo("System Name", "Niveus");
		extent.setSystemInfo("Environment", "Automation");
        htmlReporter.config().setDocumentTitle("Web Automation");
		htmlReporter.config().setReportName("Afya");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
      
		/*
		file = new File(System.getProperty("user.dir") + "/" + fileName);
       
        // Create an object of FileInputStream class to read excel file
        inputStream = new FileInputStream(file);
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
        // Check condition if the file is xlsx file
        if (fileExtensionName.equals(".xlsx")) {
        // If it is xlsx file then create object of XSSFWorkbook class
        workbook = new XSSFWorkbook(inputStream);
        }
        // Check condition if the file is xls file
        else if (fileExtensionName.equals(".xls")) {
        // If it is xls file then create object of XSSFWorkbook class
        workbook = new XSSFWorkbook(inputStream);
        }*/
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + "/Qa.properties"));
		properties.load(file);
        String sheetName = properties.getProperty("excelsheet_number").trim();
       // System.out.println(properties.getProperty("excelsheet_number")+"sheet name");
        // Read sheet inside the workbook by its name
        //String sheetName = "sheet1";
		//sheet = workbook.getSheet(sheetName);
		//System.out.println(sheetName+"sheet name");
		//System.out.println(sheet+"sheet");
	
	}
	@BeforeClass
	
	public void configBc() 
	{
		
		    driver = new ChromeDriver();
		    
			System.out.println("browser is launched");
		
		driver.navigate().to("https://stagingwebapp.afya.chat/");
		
		driver.manage().window().maximize();

		String page = "Afya";
		
		Assert.assertEquals(driver.getTitle(), page);
		Reporter.log("Afya application is sucessgully launched", true);
	}
	
	@AfterClass
	public void configAC() 
	{
		System.out.println("sucssfully logout");
		driver.quit();
	}
@AfterTest

public void flushReport() throws IOException, InterruptedException {
	
	// flush all the information to the extent report
	try {
		System.out.println("#####################step1");
	extent.flush();
	System.out.println("#####################step111111");
	System.out.println("#####################step22222");
    SendEmail email = new SendEmail();
    System.out.println("#####################step2");
	email.sendEmail(passedCount, failureCount, skippedCount);
	System.out.println("#####################step3");
	FileOutputStream fos = new FileOutputStream(file);
	workbook.write(fos);
	System.out.println("#####################step4");
	inputStream.close();
	fos.close();
//	DatabaseConnection  db = new DatabaseConnection();
//	db.databaseconnection();
      //TestMethod.driver.close();
	

}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	}
}
