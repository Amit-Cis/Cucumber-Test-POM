package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.FindCarHomepageLocator;
import utilities.SeleniumDriver;

public class FindCarHomepageActions {

	FindCarHomepageLocator findCarHomepage=null;
	public FindCarHomepageActions()
	{
		this.findCarHomepage=new FindCarHomepageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), findCarHomepage);
	}
	public void moveToAnymakeDropDown(String brand)
	{
		Select select=new Select(findCarHomepage.anyMakeDropDown);
		select.selectByVisibleText(brand);		
	}
	public boolean verifyingHeadingForFindingNextCar()
	{
		return findCarHomepage.findCarHeading.getText().equals("Find your next car");
	}
	public void moveToModelDropDown(String model)
	{
		Select select=new Select(findCarHomepage.modelDropDown);
		select.selectByVisibleText(model);		
	}
	public void clickOnShowButton()
	{
		findCarHomepage.showButton.click();		
	}
	public boolean verifyingSearchResultIsAccurate()
	{
		
	  return findCarHomepage.searchResult.getText().contains("Rolls-Royce");
	}
}
