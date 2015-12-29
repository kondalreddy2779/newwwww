package dec29;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu
{
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	@FindBy(linkText="Flights")
	WebElement flights;
	public void flights()
	{
		flights.click();
	}
	@FindBy(linkText="Car Rentals")
	WebElement carrentals;
	public void carrentals()
	{
		carrentals.click();
	}
	@FindBy(linkText="Cruises")
	WebElement cruises;
	public void cruises()
	{
		cruises.click();
	}
	@FindBy(linkText="Destinations")
	WebElement destinations;
	public void destinations()
	{
		destinations.click();
	}
	@FindBy(linkText="Vacations")
	WebElement vacations;
	public void vacations()
	{
		vacations.click();
	}
}
