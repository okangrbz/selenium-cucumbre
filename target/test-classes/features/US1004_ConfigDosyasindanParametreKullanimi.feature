Feature: US1004 Kullanici parametre ile config file i kullanabilmeli


  @config
  Scenario: TC007 configuration properties dosyasindan parametre kullanma
    Given kullanici "TechproUrl" ana sayfasinda
    Then kullanici 3 sn bekler
    And url'in  "TechproUrl" icerdigini test eder
    Then sayfayi kapatir