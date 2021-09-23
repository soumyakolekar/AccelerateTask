package Test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
	driver.findElement(By.xpath("//input[@type='text']"));
	//WebDriver driver = DriverFactory.getWebDriver();
	//List<WebElement>tableList = driver.findElements(By.xpath()));
	}

}
