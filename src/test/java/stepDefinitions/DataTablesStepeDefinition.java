package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTables;

public class DataTablesStepeDefinition {
	DataTables data = new DataTables();

	@Then("new butonuna basar")
	public void new_butonuna_basar() {
		data.newButonu.click();
	}

	@Then("isim bolumune {string} yazar")
	public void isim_bolumune_yazar(String string) {
		data.firstNameKutusu.sendKeys(string);
	}

	@Then("soyisim bolumune {string} yazar")
	public void soyisim_bolumune_yazar(String string) {
		data.lastNameKutusu.sendKeys(string);
	}

	@Then("position bolumune {string} yazar")
	public void position_bolumune_yazar(String string) {
		data.position.sendKeys(string);
	}

	@Then("ofice bolumune {string} yazar")
	public void ofice_bolumune_yazar(String string) {
		data.office.sendKeys(string);
	}

	@Then("extention bolumune {string} yazar")
	public void extention_bolumune_yazar(String string) {
		data.extantion.sendKeys(string);
	}

	@Then("startDate bolumune {string} yazar")
	public void start_date_bolumune_yazar(String string) {
		data.satartDate.sendKeys(string);
	}

	@Then("salary bolumune {string} yazar")
	public void salary_bolumune_yazar(String string) {
		data.salary.sendKeys(string);
	}

	@Then("Create tusuna basar")
	public void create_tusuna_basar() {
		data.creat.click();
	}


	@When("kullanici {string} ile arama yapar")
	public void kullaniciIleAramaYapar(String firstname) {
		data.search.sendKeys(firstname);

	}

	@Then("isim bolumunde {string} oldugunu test eder")
	public void isimBolumundeOldugunuTestEder(String firstname) {
		Assert.assertTrue(data.aramaSonucIlkElement.getText().contains(firstname));
	}
}
