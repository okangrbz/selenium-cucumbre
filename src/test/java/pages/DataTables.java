package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTables {
	public DataTables(){
		PageFactory.initElements(Driver.getDriver(),this);

	}

	@FindBy(xpath = "//button[@class='dt-button buttons-create']")
	public WebElement newButonu;

	@FindBy(xpath = "//input[@id='DTE_Field_first_name']")
	public WebElement firstNameKutusu;

	@FindBy(xpath = "//input[@id='DTE_Field_last_name']")
	public WebElement lastNameKutusu;

	@FindBy(xpath = "//input[@id='DTE_Field_position']")
	public WebElement position;

	@FindBy(xpath = "//input[@id='DTE_Field_office']")
	public WebElement office;

	@FindBy(xpath = "//input[@id='DTE_Field_extn']")
	public WebElement extantion;

	@FindBy(xpath = "//input[@id='DTE_Field_start_date']")
	public WebElement satartDate;

	@FindBy(xpath = "//input[@id='DTE_Field_salary']")
	public WebElement salary;

	@FindBy(xpath = "//button[contains(text(),'Create')]")
	public WebElement creat;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement search;

	@FindBy(xpath = "//td[@class='sorting_1']")
	public WebElement aramaSonucIlkElement;

}
