package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BaseClass {

static WebDriver driver;
static WebDriverWait wait;
static long timeout = 30;



@Test  

public static void launchbrowser()
{

	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
	
	driver =new FirefoxDriver();
	
	driver.get("https://www.thetestingworld.com/");
	

	wait  = new WebDriverWait(driver, timeout);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id ='ja-megamenu']/child ::ul[1]/child::li[2]/a")));
	
	Actions ac = new Actions(driver);
	WebElement aboutus = driver.findElement(By.xpath("//div[@id ='ja-megamenu']/child ::ul[1]/child::li[2]/a"));
   /*   aboutus.click();*/
	ac.moveToElement(element).perform();
	 WebElement mission_vision = driver.findElement(By.xpath("//div[@id ='ja-megamenu']/child ::ul[1]/child::li[2]/a[1]/following::div[1]/descendant::div[3]/descendant::ul[1]/descendant::li[1]/a[1]"));
	 mission_vision.click();
	

}
}
