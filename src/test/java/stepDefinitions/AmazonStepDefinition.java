package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazon;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
	@Given("kullanici amazon ana sayfasinda")
	public void kullanici_amazon_ana_sayfasinda() {
		Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


	}
	@Then("kullanici Nutella icin arama yapar")
	public void kullanici_nutella_icin_arama_yapar() {
		Amazon amazon=new Amazon();
		amazon.aramakutusu.sendKeys("Nutella"+ Keys.ENTER);

	}
	@Then("sonuclarin Nutella icerdigini test eder")
	public void sonuclarin_nutella_icerdigini_test_eder() {
		Amazon amazon=new Amazon();
		String aranankelime="Nutella";
		String actualAramaSonucElementi=amazon.aramaSonucElementi.getText();
		Assert.assertTrue(actualAramaSonucElementi.contains(aranankelime));

	}
	@Then("sayfayi kapatir")
	public void sayfayi_kapatir() {

		Driver.closeDriver();


	}
	@Then("kullanici Java icin arama yapar")
	public void kullanici_java_icin_arama_yapar() {
		Amazon amazon=new Amazon();
		amazon.aramakutusu.sendKeys("Java"+ Keys.ENTER);

	}
	@Then("sonuclarin Java icerdigini test eder")
	public void sonuclarin_java_icerdigini_test_eder() {
		Amazon amazon=new Amazon();
		String aranankelime="Java";
		String actualAramaSonucElementi=amazon.aramaSonucElementi.getText();
		Assert.assertTrue(actualAramaSonucElementi.contains(aranankelime));
	}


	@Then("sonuclarin Iphone icerdigini test eder")
	public void sonuclarin_iphone_icerdigini_test_eder() {
		Amazon amazon=new Amazon();
		String aranankelime="Iphone";
		String actualAramaSonucElementi=amazon.aramaSonucElementi.getText();
		Assert.assertTrue(actualAramaSonucElementi.contains(aranankelime));
	}


	@And("kullanici Iphone icin arama yapar")
	public void kullaniciIphoneIcinAramaYapar() {
		Amazon amazon=new Amazon();
		amazon.aramakutusu.sendKeys("Iphone"+ Keys.ENTER);

	}

	@Given("kullanici {string} icin arama yapar")
	public void kullanici_icin_arama_yapar(String istenenKelime) {
		Amazon amazon=new Amazon();
		amazon.aramakutusu.sendKeys(istenenKelime+ Keys.ENTER);

	}
	@Given("sonuclarin {string} icerdigini test eder")
	public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
		Amazon amazon=new Amazon();
		String aranankelime=istenenKelime;
		String actualAramaSonucElementi=amazon.aramaSonucElementi.getText();
		Assert.assertTrue(actualAramaSonucElementi.contains(aranankelime));
	}

	@Given("kullanici {string} ana sayfasinda")
	public void kullanici_ana_sayfasinda(String istenenUrl) {
	Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));


	}
	@Given("url'in  {string} icerdigini test eder")
	public void url_in_icerdigini_test_eder(String istenenKelime) {
		Amazon amazon=new Amazon();
		istenenKelime=ConfigReader.getProperty(istenenKelime);
		String actualUrl=Driver.getDriver().getCurrentUrl();
		Assert.assertTrue(actualUrl.contains(istenenKelime));
	}

	@Then("kullanici {int} sn bekler")
	public void kullaniciSnBekler(int istenenSaniye) {
		try {
			Thread.sleep(istenenSaniye*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
