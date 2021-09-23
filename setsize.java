package Test1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setsize {
  @Test
  public void f() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
		Dimension d=new Dimension(200,600);
		driver.manage().window().setSize(d);
  } 
}
