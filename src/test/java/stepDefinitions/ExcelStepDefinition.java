package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinition {
	Workbook book;

	@Given("kullanici excel dosyasini kullanilabilir hale getirir")
	public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() {
		String yol = "src/test/resources/ulkeler.xlsx";
		try {
			FileInputStream fis = new FileInputStream(yol);
			book = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Then("{int}.satirdaki {int}.hucreyi yazdirir")
	public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
		String istenenhucreyiYazdir = book.
				getSheet("sayfa1").
				getRow(satir).
				getCell(sutun - 1).
				toString();
		System.out.println(satir + " inci satir " + sutun + " inci sutundaki deger : " + istenenhucreyiYazdir);

	}

	@Then("baskenti Jakarta olan ulke ismini yazdirir")
	public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
		//forloop ile tum satirlari kontrol etmem gerekiyor
		//bunun icinde satir sayisina ihtiyacim var
		int satirSayis=book.getSheet("sayfa1").getLastRowNum();
		for (int i = 0; i <= satirSayis; i++) {
			if (book.getSheet("sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){
				System.out.println("Baskenti JAkarta oaln ulke :"+
						book.getSheet("sayfa1").getRow(i).getCell(0).toString());
			}

		}


	}

	@Then("Ulke sayisini {int} oldugunu test eder")
	public void ulke_sayisini_oldugunu_test_eder(Integer ulkeSayisi) {
		int actualUlkeSayis=book.getSheet("sayfa1").getLastRowNum();
		Assert.assertTrue(ulkeSayisi==actualUlkeSayis);

	}


	@And("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
	public void fizikiOlarakKullanilanSatirSayisininOldugunuTestEder(int fizikiKullanilanSatirSayisi) {
		int actualFizikiKulSatir=book.getSheet("sayfa1").getPhysicalNumberOfRows();
		Assert.assertTrue(fizikiKullanilanSatirSayisi==actualFizikiKulSatir);
	}
}
