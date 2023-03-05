@manager_login_test
Feature: US167854_manager_login_test

  Scenario Outline:kullanici tum manager login bilgileriyle giriş yapabilmeli


    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider
    And kullanıcı adini girer "<email>"
    And sifreyi girer "<sifre>"
    And login buttoning basar
    Then login islemi gerçekleşir
    Then close the application

    Examples:email_sifre
      | email                          | sifre     |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |
