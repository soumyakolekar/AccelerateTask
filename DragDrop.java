package Test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.switchTo().frame(0);

WebElement fromElement = driver.findElement(By.id("draggable"));
WebElement toElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDrop(fromElement, toElement).build().perform();
String afterDragging = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		
		if(afterDragging.equals("Dropped!"))
			System.out.println("Drag successful.");
		else
			System.out.println("Drag Unsuccessful.");
	}

}
