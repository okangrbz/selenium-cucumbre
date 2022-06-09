#amazon sayfasına gidip nutella, elma, armut, java aratıp
#sonuçların arama yaptığımız kelimeyi içerdiğini test edelim,
Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

  @negative
  Scenario Outline: TC12 amazonda listedeki elementleri aratma

    Given kullanici "amazonUrl" ana sayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKotrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKotrol |
      | nutella       | nutella             |
      | elma          | elma                |
      | java          | java                |
      | armut         | armut               |

