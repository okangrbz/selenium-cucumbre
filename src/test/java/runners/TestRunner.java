package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//jUnit den geliyor
@CucumberOptions(
		plugin={"html:target/cucumber-reports.html",
				"json:target/json-reports/cucumber.json",
				"junit:target/xml-report/cucumber.xml"
		},
		features = "src/test/resources/features",
		glue = "stepDefinitions",
		tags = "@autumatioUrl",
		dryRun = true
)
public class TestRunner {
	/*
	Bir framework de bir tek runner class ı yeterli olabilir.
	TestRunner classında class body sinde  hiç bir şey olmaz.
	TestRunner classımızı önemli yapan iki adet annotation vardır.
	bu Runwit() yüzünden JUnit ile yüklendi cucumbre.
	@RunWith(Cucumber.class) notasyonu runner classına çalışma özelliği katar.
	Bu notation olduğu için cucumber freamwork ümüzde JUnit kullanmayı tercih
	ediyoruz.

	feature: TestRunner dosyasının feature dosyalarını nereden bulacağını tarif eder.
	glue: Step definitions dosyalarını nerede bulacağımızı gösterir.
	tags: o an hangi tagı çalıştırmak istiyorsak onu belli eder.

	dryRun :  iki seçenek vardır.
		1-dryRun= true yazdığımızda Testimizi çalıştırmadan sadece eksik adımları bize verir.
		2-dryRun= false yazdığımızda ise testlerimizi çalıştırır.
	 */
}
