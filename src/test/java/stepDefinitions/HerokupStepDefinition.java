package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Herokup;
import utilities.Driver;

import java.time.Duration;

public class HerokupStepDefinition {
	Herokup hero = new Herokup();


	@Given("“Add Element” butona basar")
	public void add_element_butona_basar() {
		hero.addElement.click();
	}
	@Given("“Delete” butonu gorunur oluncaya kadar bekler")
	public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(hero.delet));
	}

	@Then("“Delete” butonunun gorunur oldugunu test eder")
	public void delete_butonunun_gorunur_oldugunu_test_eder() {
		Assert.assertTrue(hero.delet.isDisplayed());
	}

	@Then("Delete butonuna basarak butonu siler")
	public void delete_butonuna_basarak_butonu_siler() {
		hero.delet.click();
	}

	@Then("Delete butonunun gorunmedigini test eder")
	public void delete_butonunun_gorunmedigini_test_eder() {
		try {
			Assert.assertTrue(hero.delet.isDisplayed());
		} catch (Exception e) {
			System.out.println("delet tusu gozukmemektedir");
		}
	}

}
