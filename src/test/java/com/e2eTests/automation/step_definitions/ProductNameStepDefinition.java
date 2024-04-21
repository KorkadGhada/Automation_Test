package com.e2eTests.automation.step_definitions;

import java.time.Duration;

import com.e2eTests.automation.page_objects.ProductNamePage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.When;

public class ProductNameStepDefinition {
	
	public ProductNamePage productNamePage;

	public ProductNameStepDefinition() {
		productNamePage = new ProductNamePage();
	}
	
	@When("Je clique sur Catalog")
	public void jeCliqueSurCatalog() {
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ProductNamePage.getMenuCatalog().click();
	}
	@When("Je clique sur Products")
	public void jeCliqueSurProducts() {
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ProductNamePage.getMenuProduct().click();
	}
	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String productName) {
		ProductNamePage.getProductName().sendKeys(productName);
	}
	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		ProductNamePage.getSearchBtn().click();
	}

}