package dec28;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login extends Constant
{
	@Test
	public void loginTest()
{ 
	driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window();
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
}
}
