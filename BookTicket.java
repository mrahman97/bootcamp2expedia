package ExpediaTicket;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class BookTicket {
	static WebDriver driver;
  @Test
  public void f() {
	
	   driver.navigate().to("https://www.expedia.com");
	   
		 driver.findElement(By.id("primary-header-flight")).click();
		 driver.findElement(By.id("flight-origin-flp")).sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
		 driver.findElement(By.id("flight-destination-flp")).sendKeys("Miami, FL (MIA-All Airports)");
		driver.findElement(By.id("flight-departing-flp")).click();
		 driver.findElement(By.xpath("(//*[@data-day='29'])[1]")).click();
		 driver.findElement(By.id("flight-returning-flp")).click();
		 driver.findElement(By.xpath("(//*[@data-day=\"27\"])[2]")).click();
		 driver.findElement(By.xpath("(//*[@type='button'])[24]")).click();
		 driver.findElement(By.xpath("(//*[@class=\'uitk-icon-svg uitk-step-input-icon\'])")).click();
		 driver.findElement(By.xpath("(//*[@type=\'submit\'])[11]")).click();
		 driver.findElement(By.xpath("(//*[@class=\'btn-secondary btn-action t-select-btn\'])[1]")).click();
		 driver.findElement(By.xpath("(//*[@class=\'btn-secondary btn-action t-select-btn\'])[2]")).click();
		 driver.findElement(By.xpath("(//*[@class=\'btn-secondary btn-action t-select-btn\'])[2]")).click();
		 driver.findElement(By.xpath("(//*[@type='submit'])[11]")).click();
		 driver.findElement(By.id("firstname[0]")).sendKeys("muslina");
		 driver.findElement(By.id("lastname[0]")).sendKeys("rahman");
		 driver.findElement(By.xpath("//*[@class='cko-field always-include gb-whitelist alpha3CountryCode']")).click();
		 driver.findElement(By.id("phone-number[0]")).sendKeys("4844656280");
		 driver.findElement(By.xpath("(//*[@class='invalid'])[2]")).click();
		 driver.findElement(By.id("date_of_birth_month[0]")).sendKeys("06");
		 driver.findElement(By.id("date_of_birth_day[0]")).sendKeys("24");
		 driver.findElement(By.id("FLT.CKO.DOBYEAR")).sendKeys("1991");
		 
		 
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation_aps_code\\src\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		 

  }

  @AfterClass
  public void afterClass() {
  }

}
