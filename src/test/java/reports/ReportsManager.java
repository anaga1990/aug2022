package reports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportsManager {
	
	ExtentReports extent;
	ExtentTest extentTest;
	@BeforeSuite
	public void startMyReport() {
		//start reports creation
		extent = new ExtentReports(); 
		
		//ExtentSparkReporter template reports need to created
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Extent_APIJava.html");
		
		//Attaching template to Reports generation
		extent.attachReporter(spark);
		spark.config(
				  ExtentSparkReporterConfig.builder()
				    .theme(Theme.STANDARD)
				    .documentTitle("BasicSanity")
				    .reportName("API report")
				    .build()
				);

	}
	
	@Test
	public void apiLoginApplication() {
		extentTest = extent.createTest("apiLoginApplication");
		System.out.println("API provide valid authintication");
		System.out.println("API LoginApplication");
		extentTest.log(Status.PASS, "extentTest.log => apiLoginApplication is Success");
		extentTest.pass("extentTest.pass ==> apiLoginApplication is Success");
		
	}
	
	@Test
	public void apiLogOutApplication() {
		extentTest = extent.createTest("apiLogOutApplication");
		System.out.println("API LogOutApplication");
		extentTest.pass("extentTest.pass ==> apiLogOutApplication is Success");
	}
	
	@Test
	public void apiorderIphone() {
		extentTest = extent.createTest("apiorderIphone");
		System.out.println("API orderIphone");
		extentTest.pass("extentTest.pass ==> apiorderIphone is Success");
	}
	
	@Test
	public void apiorderAndroidPhone() {
		extentTest = extent.createTest("apiorderAndroidPhone");
		System.out.println("API orderAndroidPhone");
		extentTest.pass("extentTest.pass ==> apiorderAndroidPhone is Success");
	}
	
	@Test
	public void apiorderToys() {
		extentTest = extent.createTest("apiorderToys");
		System.out.println("API orderToys");
		extentTest.pass("extentTest.pass ==> apiorderToys is Success");
	}
	

	@Test
	public void apiorderHomeApplications() {
		extentTest = extent.createTest("apiorderHomeApplications");
		System.out.println("API orderHomeApplications");
		extentTest.pass("extentTest.pass ==> apiorderHomeApplications is Success");
	}
	
	@Test
	public void addAddress_api() {
		extentTest = extent.createTest("addAddress_api");
		System.out.println("API addAddress");
		extentTest.pass("extentTest.pass ==> addAddress_api is Success");
	}
	
	@Test
	public void api_updateAddress() {
		extentTest = extent.createTest("api_updateAddress");
		System.out.println("API updateAddress");
		extentTest.pass("extentTest.pass ==> api_updateAddress is Success");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void deleteAddress_api() {
		extentTest = extent.createTest("deleteAddress_api");
		System.out.println("API deleteAddress");
		extentTest.pass("extentTest.pass ==> deleteAddress_api is Success");
	}
	
	@Test
	public void WebloginApplication() {
		extentTest = extent.createTest("WebloginApplication");
		System.out.println("open URL");
		extentTest.warning("please use Chrome browser for best Exectuion");
		extentTest.info("base url opend");
		System.out.println("entered valid phone Number");
		extentTest.info("entered valid phone Number Successfully");
		System.out.println("entered valid OTP");
		extentTest.info("OTP Successfully");
		System.out.println("click on Login Button");
		extentTest.info("Login Successfully");
		System.out.println("Verify the Homepage Displyed & Title of the page");
		extentTest.pass("extentTest.pass ==> WebloginApplication is Success");
	}
	
	
	@Test
	public void buy43InchSmartTv() throws InterruptedException {
		extentTest = extent.createTest("WebloginApplication");
		Thread.sleep(2000);
		System.out.println("************ buy43InchSmartTv Started *********");
		System.out.println("search for 43 inch Smart TV");
		System.out.println("click the releme 43 inch TV");
		System.out.println("verify releme 43 inch TV open in new tab");
		System.out.println("click on Add to Cart");
		extentTest.fail("it took more than 1 second");
	}
	
	@AfterSuite
	public void publishTheReport() {
		extent.flush();
	}
	
}
