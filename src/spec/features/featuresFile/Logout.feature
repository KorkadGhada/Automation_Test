@logout @tnr
Feature: Deconnexion
  ETQ utilisateur je souhaite me deconnecter

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @logout
  Scenario: Je souhaite souhaite me deconnecter
    When Je me deconnect