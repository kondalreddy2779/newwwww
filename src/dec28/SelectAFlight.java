package dec28;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectAFlight extends Constant
{
@Test
public void selectaFlight()
{
	driver.findElement(By.name("outFlight")).click();
	driver.findElement(By.name("inFlight")).click();
	driver.findElement(By.name("reserveFlights")).click(); 
}
}
