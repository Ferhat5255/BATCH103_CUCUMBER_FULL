@google_search
Feature: ilk feature file

  Background: Google_sayfasina_git
  Given kullanici google gider

  @testrunner
  Scenario: TC01_google_iphone_arama
 # Given kullanici google gider          -->Background: dan dolayi bu adimlari yukari aliyorum
    When kullanici iphone icin arama yapar
    Then sonuclarda iphone oldugunu dogrular
    Then close the application

  @tesla
  Scenario: TC02_google_tesla_arama
#  Given kullanici google gider             -->Background: dan dolayi bu adimlari yukari aliyorum
    When kullanici tesla icin arama yapar
    Then sonclarda tesla oldugunu dogrular
    Then close the application



  # 1. Her feature file, Feature: kelimesi ile baslamak zorundadir
  # 2. Her bir file da, yalniz bir Feature: kullanilabilir.
  # 3. Senaryo(TEST CASE) olusturmak icin Scenario keimesi kullanilir
  # 4. Birden Fazla Scenario: kullanilabilir
  # 5. Her bir adim Given, When, And, But,* kelimelerinden biriyle baslamalidir
  # 6.Given -> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
  # 7.Then -> Genelde son satirlarda, verification stepleri icin kullanilir
  # 8. And, When -> Genelde ara adimlarda baglar olarak kullanilir
  #NOTE: Teknik olarak istenilen kelime istenilen step te kullanilabilir,
  #      ama anlam karmasasi olmamasi icin bu adimlar takip edilir
  #  9. Belirli Scenario lari calistirmak icin cucumber tags ler kullanilir
  #  tag ler Fetuature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
  # 10. Background: Her bir Scenario kelimesinden ONCE tek bir sefer calisir
  # 11. dryRun=false -> dryRun yokmus gibi normal calisir. Yani tum adimlar tek tek browser da calsir.
  #     dryRun=true -> Yeni bir STEP(ADIM) eklendiginde sadece definitions lari olusturmak icin kullanilir
  #     Kullanilma sebebi zamandan tasarruftur.