package com.e2eTests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class CategorieNamePage extends BasePage {
	
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement menuCategories;
	
	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement categorytName;
	
	
	@FindBy(how = How.ID, using = "search-categories")
	private static WebElement searchCategoriesBtn;

	public CategorieNamePage() {
		super(Setup.getDriver());
		
	}
	public static WebElement getMenuCategories() {
		return menuCategories;
	}

	public static WebElement getCategorytName() {
		return categorytName;
	}

	public static WebElement getSearchCategoriesBtn() {
		return searchCategoriesBtn;
	}

	
	
}
