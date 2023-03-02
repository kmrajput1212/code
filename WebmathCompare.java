package Infosys.Ikea.TESTNG;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebmathCompare {
@Test
public void Compare() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\drivers\\chromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	 FileReader reader = new FileReader ("C:\\Users\\Admin\\eclipse-workspace\\Ikea\\src\\main\\java\\Infosys\\Ikea\\TESTNG\\TestData.properties");
	 Properties props = new Properties ();
	 props.load (reader);
	  driver.get(props.getProperty("search"));
	  WebElement K8 = driver.findElement(By.xpath (props.getProperty("K8")));
	  K8.click();
	  WebElement Compare = driver.findElement(By.xpath(props.getProperty("Compare")));
	  Compare.click();
	  WebElement Compare2 = driver.findElement(By.xpath(props.getProperty("n1")));
	  Compare2.sendKeys("5");
	  WebElement Compare3 = driver.findElement(By.xpath(props.getProperty("d1")));
	  Compare3.sendKeys("25");
	  WebElement Compare4 = driver.findElement(By.xpath(props.getProperty("n2")));
	  Compare4.sendKeys("5");
	  WebElement Compare5 = driver.findElement(By.xpath(props.getProperty("d2")));
	  Compare5.sendKeys("10");
	  WebElement onelarge = driver.findElement(By.xpath(props.getProperty("one")));
	  onelarge.click();
	  
	  
	  
	
}
}
