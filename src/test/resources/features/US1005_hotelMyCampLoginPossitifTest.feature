Feature: US1005 dogru kulklanici adi ve sifresi ile giris yapabilmeli


Scenario: TC08 positive login test
  Given kullanici "HMCUrl" ana sayfasinda
  Then Log in yazisina tiklar
  And gecerli username girer
  And gecerli password girer
  And Login butonuna basar
  Then sayfaya giris yaptigini kontrol eder
  And kulllanici sayfayi kapatir
