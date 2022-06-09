package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Automation;
import utilities.Driver;

public class AutomationStepDefinition {
	Automation auto = new Automation();
	Actions action = new Actions(Driver.getDriver());

	@Given("user sign in linkine tiklar")
	public void user_sign_in_linkine_tiklar() {
		auto.signIn.click();
	}

	@Given("user Create and account bölümüne email adresi girer")
	public void user_create_and_account_bölümüne_email_adresi_girer() {
		auto.emailTextBox.sendKeys("okanbaba00@gmail.com");

	}

	@Given("Create an Account butonuna basar")
	public void create_an_account_butonuna_basar() {
		auto.createAccountButton.click();

	}

	@Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
	public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

		Faker faker=new Faker();
		auto.radio.click();
		action.sendKeys(Keys.TAB)
				.sendKeys(faker.name().lastName()+Keys.TAB)
				.sendKeys(faker.name().lastName()+Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(faker.internet().password()+Keys.TAB)
				.sendKeys("10"+Keys.TAB)
				.sendKeys("January"+Keys.TAB)
				.sendKeys("2000"+Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(faker.company().name()+Keys.TAB)
				.sendKeys(faker.address().fullAddress()+Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(faker.address().city()+Keys.TAB)
				.sendKeys("Alaska"+Keys.TAB)
				.sendKeys(faker.address().zipCode()+Keys.TAB)
				.sendKeys("United States"+Keys.TAB)
				.sendKeys(faker.phoneNumber().phoneNumber()+Keys.TAB)
				.sendKeys(faker.phoneNumber().phoneNumber()+Keys.TAB)
				.sendKeys("ALSK").perform();
	}

	@Given("user Register butonuna basar")
	public void user_register_butonuna_basar() {
		auto.registerButton.click();

	}

	@Then("hesap olustugunu dogrular")
	public void hesap_olustugunu_dogrular() {


	}

}
