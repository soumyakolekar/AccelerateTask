package Test1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		  System.out.println("Start test");
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
    	  driver = new ChromeDriver();
    	  String url = "https://www.google.com";
    	  driver.get(url);
    	  driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("testing");
	Thread.sleep(2000);
	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
	Thread.sleep(2000);
	System.out.println("Total suggestion"+list.size());
	Thread.sleep(2000);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
	if(list.get(i).getText().contains("testing types")) {
		list.get(i).click();
		break;
	}}
	}

}
