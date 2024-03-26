@authentification
Feature: Authentification
  ETQ utilisateur je souhaite m'anthentifier

  @login-valid
  Scenario: Je souhaite tester la page LOGIN
    Given Je visite l'application NopCommerce
    When Je saisi l'adresse mail
    And Je saisi le login
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
