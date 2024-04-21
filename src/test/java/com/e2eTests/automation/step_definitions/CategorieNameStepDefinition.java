package com.e2eTests.automation.step_definitions;

import java.time.Duration;

import com.e2eTests.automation.page_objects.CategorieNamePage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.When;

public class CategorieNameStepDefinition {
	
	public CategorieNamePage categorieNamePage ;
	
	public  CategorieNameStepDefinition() {
		categorieNamePage = new CategorieNamePage() ;
	}
	
	@When("Je clique sur Categories")
	public void jeCliqueSurCategories() {
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CategorieNamePage.getMenuCategories().click();
	   
	}
	@When("Je saisis le nom du categorie {string}")
	public void jeSaisisLeNomDuCategorie(String categorie) {
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		CategorieNamePage.getCategorytName().sendKeys(categorie);
	    
	}

	@When("Je clique sur le bouton search categorie")
	public void jeCliqueSurLeBoutonSearchCategorie() {
		CategorieNamePage.getSearchCategoriesBtn().click();
	   
	}

}
