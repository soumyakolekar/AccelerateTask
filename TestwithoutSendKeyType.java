package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestwithoutSendKeyType {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript ("document.getElementById('identifierId').value='Some_Random_Mail@gmail.com'");
		
		
		driver.close();
		driver.quit();
  }
}
