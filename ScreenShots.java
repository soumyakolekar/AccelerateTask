package Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScreenShots {
  @Test
  public void f() { 
	  
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	TakesScreenshot ts=(TakesScreenshot)driver;
		File scrFile=(ts).getScreenshotAs(OutputType.FILE);
		File desFile=new File("./Desktop/img.png");
		try {
			FileUtils.copyFile(scrFile,desFile) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		driver.close();
		driver.quit();
  }
}
