package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AddNewProductPage;

import io.cucumber.java.en.When;

public class AddNewProductStepDefinition {

	public AddNewProductPage addNewProductPage;

	public AddNewProductStepDefinition() {
		addNewProductPage = new AddNewProductPage();
	}

	@When("je clique sur le bouton Add New")
	public void jeCliqueSurLeBoutonAddNew() {
		AddNewProductPage.getBtnAddNew().click();

	}

	@When("Je saisis le nom du produit")
	public void jeSaisisLeNomDuProduit() {
		AddNewProductPage.getProductName().sendKeys("Iphone 15");
	}

	@When("Je saisis une description du produit {string}")
	public void jeSaisisUneDescriptionDuProduit(String string) {
		AddNewProductPage.getShortDescription().sendKeys("Iphone couleur violet");
	}

	@When("Je saisis une description détailée du produit {string}")
	public void jeSaisisUneDescriptionDétailéeDuProduit(String string) {
		AddNewProductPage.getFullDescription().sendKeys("Iphone 15 de capacité 256 Go et de couleur noire");

	}

	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		AddNewProductPage.getBtnSave().click();
	}

}