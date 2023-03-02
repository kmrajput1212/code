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

public class WebMathPlace {
@Test
 public void place () throws IOException {
	
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
		  WebElement placeValue= driver.findElement(By.xpath(props.getProperty("placeValue")));
		  placeValue.click();
		  WebElement number1 = driver.findElement(By.xpath(props.getProperty("number1")));
		  number1.sendKeys("125");
		  WebElement Button1 = driver.findElement(By.xpath(props.getProperty("Button1")));
		  Button1.click();
}

}
