package dec28;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class FindAFlight extends Constant
{
	@Test 
	public void findaFlight()
	{
		driver.findElement(By.name("tripType")).click();
		driver.findElement(By.name("airline")).sendKeys("united Airlines");
		driver.findElement(By.name("findFlights")).click();
		Sleeper.sleepTightInSeconds(3);	}
 
}
