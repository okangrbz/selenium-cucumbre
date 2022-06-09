package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Grou89 {
	public Grou89(){
		PageFactory.initElements(Driver.getDriver(),this);
	}

@FindBy(xpath = "//*[text()='Tout accepter']")
	public WebElement cookieSave;

@FindBy(xpath = "//tr//th")
	public List<WebElement> baslik;

@FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
	public WebElement iframe;



}
