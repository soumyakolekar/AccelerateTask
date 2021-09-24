package SeleniumBasics;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDown {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

   String projectPath = System.getProperty("user.dir");
   System.out.println(projectPath);
     
   driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[3]/strong")).click();
   Thread.sleep(5000);
   List<WebElement> list = driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div"));
   
   for (WebElement cr : list)
   {
    System.out.println("Values " + cr.getAttribute("innerHTML"));
  
    if (cr.getAttribute("innerHTML").contains("HTML,CSS")) {
     
     cr.click();
      break;
     }
    }
	}

}
