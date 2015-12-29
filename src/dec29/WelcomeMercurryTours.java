package dec29;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercurryTours 
{
@FindBy(name="userName")
WebElement userName;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement login;
public void findAFlight(String u,String p)
{
	userName.sendKeys(u);
	password.sendKeys(p);
	login.click();
}
@FindBy(linkText="your destinations")
WebElement destinations;
public void destinations()
{
	destinations.click();
}
@FindBy(linkText="featured vacation destinations")
WebElement vacations;
public void vacations()
{
	vacations.click();
}
@FindBy(linkText="Register here")
WebElement register;
public void register()
{
	register.click();
}

}
