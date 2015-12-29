package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait_WebDriverWait {
FirefoxDriver driver;
@BeforeTest
public void setUp()
{
	driver=new FirefoxDriver();
	driver.get("http://pvrcinemas.com");
}
@Test
public void waitTest()
{
	WebDriverWait myWait=new WebDriverWait(driver,60);
	//class name of skip now left addd
	driver.findElement(By.className("model-skip")).click();
	//xpath of the first movie play button
	//wait for it to become invisible
	myWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
    //xpath of second movie play button
	//wait for it to become visiblw & click on it
	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
}
}
