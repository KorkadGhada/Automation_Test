@categoriename @tnr
Feature: Recherche nom categorie
  ETQ utilisateur je souhaite chercher le nom du categorie

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @categorieName
  Scenario: Je souhaite chercher le nom du categorie
    When Je clique sur Catalog
    And Je clique sur Categories
    And Je saisis le nom du categorie "desktop"
    And Je clique sur le bouton search categorie
