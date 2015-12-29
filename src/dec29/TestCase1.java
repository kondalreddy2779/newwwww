package dec29;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase1 
{
	@Test
			public void loginTest()
		{
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("MyProfile");
			FirefoxDriver driver=new FirefoxDriver(fp);
			driver.get("http://newtours.demoaut.com/");
			//creating object for pages class 
			WelcomeMercurryTours wm=PageFactory.initElements(driver,WelcomeMercurryTours.class);
			wm.findAFlight("tutorial", "tutorial");
		}
	}


