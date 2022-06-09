Feature: US1012 kullanici registre yapabilmeli

  @autumatioUrl
  Scenario: TC17 kullanici uygun datalarla register olabilmeli
    Given kullanici "autumatioUrl" ana sayfasinda
    And user sign in linkine tiklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrular
