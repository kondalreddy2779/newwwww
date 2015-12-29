package dec29;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours 
{
@FindBy(name="email")
WebElement userName;
@FindBy(name="password")
WebElement password;
@FindBy(name="confirmPassword")
WebElement confirmPassword;
@FindBy(name="Register")
WebElement register;
public void contactInformation()
{
	userName.sendKeys("tutorial");
	userName.sendKeys("tutorial");
	confirmPassword.sendKeys("tutorial");
	register.click();
}


}
