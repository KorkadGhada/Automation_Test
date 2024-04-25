@addnewproduct
Feature: Ajout d'un nouveau produit
  ETQ utilisateur je souhaite ajouter un nouveau produit

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @addnewproduct
  Scenario: Je souhaite ajouter un nouveau produit
    When Je clique sur Catalog
    And Je clique sur Products
    And je clique sur le bouton Add New
    And Je saisis le nom du produit "Iphone 15"
    And Je saisis une description du produit "Iphone couleur noire"
    And Je saisis une description détailée du produit "Iphone 15 de capacité 256 Go et de couleur noire"
    And Je clique sur le bouton save