package dec28;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookaFlight extends Constant
{
	@Test
	public void bookaFlight()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("kondalhjghjghjghjfghfgh");
		driver.findElement(By.name("passLast0")).sendKeys("reddygfhfghfghggdfhgfh");
		driver.findElement(By.name("creditnumber")).sendKeys("7894561236");
		driver.findElement(By.name("buyFlights")).click();
	}
}

