
@wip
Feature: US1002 Kullanici ortak adimlari background ile calistirir

  Background: ortak adim
    Given kullanici amazon ana sayfasinda
@pr1
  Scenario: TC04 amazon nutella arama
    And kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    Then sayfayi kapatir

@pr2
  Scenario: TC05 amazon java arama
    And kullanici Java icin arama yapar
    Then sonuclarin Java icerdigini test eder
    And sayfayi kapatir