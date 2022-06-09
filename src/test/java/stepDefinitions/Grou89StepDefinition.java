package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Grou89;
import utilities.Driver;

import java.util.List;

public class Grou89StepDefinition {
	Grou89 grou = new Grou89();

	@Then("Cokie sorulursa kabul eder")
	public void cokie_sorulursa_kabul_eder() {
		Driver.getDriver().switchTo().frame(grou.iframe);
		grou.cookieSave.click();
	}

	@And("Istenen {string} sutunundaki tum degerleri yazdirir")
	public void istenenSutunundakiTumDegerleriYazdirir(String istenenStun) {
		List<WebElement> tabloBaslikListesi = grou.baslik;
		//listemiz web elementlerden olusuyot
		//dolayisiyla bu web elementlerden hangisi istenen stun basligini tasiyor bilemeyiz
		int istenenbaslikIndex = -3;
		for (int i = 0; i < tabloBaslikListesi.size(); i++) {
			if (tabloBaslikListesi.get(i).getText().equals(istenenStun)) {
				istenenbaslikIndex = i + 1;
				break;
			}
		}
		//forloup ile tum sutun başlıklarını karşılaştırdım.
		//loop bittiğinde başlık bulunup bulunmadığını kontrol etmek ve
		//bulundu ise yoluma devam etmek istiyorum

		if (istenenbaslikIndex != -3) {//-3 e esit degilse baslik bulundu
			List<WebElement> istenenStundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenbaslikIndex + "]"));
			for (WebElement each : istenenStundakiElementler) {
				System.out.println(each.getText());
			}

		} else {//baslik bulunamadi
			System.out.println("istenen baslik listede yoktur");
		}


	}
}
