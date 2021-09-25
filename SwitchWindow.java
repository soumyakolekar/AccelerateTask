package Test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class SwitchWindow { WebDriver driver;
@BeforeClass
public void beforeClass() {
	 
 	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
 	  driver = new ChromeDriver();
 	  String url ="http://openclinic.sourceforge.net/openclinic/home/index.php";
 	  driver.get(url);
 	  driver.manage().window().maximize();
}
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(3000);
	    
	    String ParentWindowHandle = driver.getWindowHandle();
	    System.out.println("ParentWindowhandle"  +ParentWindowHandle);
	    
	    driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
	    
	    Thread.sleep(4000);
	       
	    driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
	
	    driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
	    
	    Select field = new Select(driver.findElement(By.id("search_type")));
	
	field.selectByVisibleText("First Name");
	field.selectByIndex(2);
	
	 driver.findElement(By.id("search_patient")).click();
  }


  @AfterClass
  public void afterClass() {
	  
		 driver.close();
		 driver.quit();
  }

}
