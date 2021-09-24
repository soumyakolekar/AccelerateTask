package Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleAccount {
  WebDriver driver;
	@Test
  public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S2064312677%3A1632463452008024&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");

	    WebElement a1 = driver.findElement(By.name("firstName"));
	    a1.sendKeys("Somi");
	    
	    String firstName =  a1.getAttribute("value");
	    
	    System.out.println("First Name:" +firstName);
	    
	    WebElement a2 = driver.findElement(By.name("lastName"));
	    a2.sendKeys("Kolekar");
	    
	    String lastName =  a2.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Last Name:" +lastName);
	    
	    WebElement a3 = driver.findElement(By.name("Username"));
	    String Username =  a3.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Username:" +Username);
	    
	    WebElement a4 = driver.findElement(By.name("Passwd"));
	    a4.sendKeys("Busstop@123");
	    
	    String Passwd =  a4.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Password:" +Passwd);
	    
	    WebElement a5 = driver.findElement(By.name("ConfirmPasswd"));
	    a5.sendKeys("Busstop@123");
	    
	    String ConfirmPassword =  a5.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Confirm Password:" +ConfirmPassword);
	    
	    driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button")).click();
	   
	    Thread.sleep(3000);
	    WebElement a6 = driver.findElement(By.id("phoneNumberId"));
	    a6.click();
	    a6.sendKeys("9589676608");
	
	    String Pno =  a6.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Phoneno:" +Pno);
	    driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
	    driver.close();
	    driver.quit();
	   
	}
	}
