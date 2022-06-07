#When kullanici https://editor.datatables.net/ adresine gider
#        Then new butonuna basar
#        And tum bilgileri girer
#        And Create tusuna basar
#        When kullanici ilk isim ile arama yapar
#        Then isim bolumunde isminin oldugunu dogrular
Feature: US1009 DataTables sitesinden 5 farkli giris yapalim

  @data
  Scenario Outline: TC13 5 farkli kayit girisi yapalim
    Given kullanici "datatableUrl" ana sayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastName>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<possion>" yazar
    And kullanici 1 sn bekler
    And ofice bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extention bolumune "<extention>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<satartDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
      | firstname | lastName | possion | office | extention | satartDate | salary |
      | okan      | okan     | QA      | Ankara | ff        | 2019-12-12 | 5000   |
      | Berk      | Can      | tester  | ankara | api       | 2022-05-05 | 11000  |
      | Hüseyin   | Korkmaz  | BA      | berlin | -         | 2022-07-10 | 40000  |
      | Fatih     | Sahin    | PO      | berlin | -         | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester  | ankara | database  | 2022-06-03 | 11000  |