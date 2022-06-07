# https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
#“Add Element” butona basin
#“Delete” butonu gorunur oluncaya kadar bekleyin
#“Delete” butonunun gorunur oldugunu test edin
#Delete butonuna basarak butonu silin
#Delete butonunun gorunmedigini test edin---->bir butonun gorunmedigi test edilmez

Feature: US1010 herekouapp sitesi delete butonu testi

  @heroku
  Scenario: TC delete butonunu test edelim
    Given kullanici "herokuURL" ana sayfasinda
    And “Add Element” butona basar
    And “Delete” butonu gorunur oluncaya kadar bekler
    Then “Delete” butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder
    And sayfayi kapatir