package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampStepDefinition {
	@Then("Log in yazisina tiklar")
	public void log_in_yazisina_tiklar() {
		HmcPage hmc=new HmcPage();
		hmc.loginButonu.click();


	}

	@Then("gecerli username girer")
	public void gecerli_username_girer() {
		HmcPage hmc=new HmcPage();
		hmc.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

	}

	@Then("gecerli password girer")
	public void gecerli_password_girer() {
		HmcPage hmc=new HmcPage();
		hmc.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

	}

	@Then("Login butonuna basar")
	public void login_butonuna_basar() {
		HmcPage hmc=new HmcPage();
		hmc.loginButonu2.click();

	}

	@Then("sayfaya giris yaptigini kontrol eder")
	public void sayfaya_giris_yaptigini_kontrol_eder() {
		HmcPage hmc=new HmcPage();

		Assert.assertTrue(hmc.hotelManagement.isDisplayed());

	}

	@Then("kulllanici sayfayi kapatir")
	public void kulllanici_sayfayi_kapatir() {
		Driver.closeDriver();
	}


	@And("gecersiz password girer")
	public void gecersizPasswordGirer() {
		HmcPage hmc=new HmcPage();
		hmc.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));

	}

	@Then("sayfaya giris yapilamadigini test eder")
	public void sayfayaGirisYapilamadiginiTestEder() {
		HmcPage hmc=new HmcPage();
		Assert.assertTrue(hmc.loginButonu.isDisplayed());
	}

	@And("gecersiz username girer")
	public void gecersizUsernameGirer() {
		HmcPage hmc=new HmcPage();
		hmc.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));

	}


	@And("gecersiz username olarak {string} girer")
	public void gecersizUsernameOlarakGirer(String arg0) {
		HmcPage hmc=new HmcPage();
		hmc.usernameKutusu.sendKeys(arg0);
	}

	@And("gecersiz password olarak {string} girer")
	public void gecersizPasswordOlarakGirer(String arg0) {
		HmcPage hmc=new HmcPage();
		hmc.passwordKutusu.sendKeys(arg0);
	}
}
