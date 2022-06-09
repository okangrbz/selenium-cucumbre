@tumu
Feature: US1001 Kullanici Amazon sayfasinda arama yapar

  @sirali
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon ana sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @pr1
  Scenario: TC02 kullanici amazonda Java aratir

    Given kullanici amazon ana sayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @pr2
  Scenario: TC03 kullanici amazonda Iphone aratir

    When kullanici amazon ana sayfasinda
    And kullanici Iphone icin arama yapar
    Then sonuclarin Iphone icerdigini test eder
    And sayfayi kapatir
