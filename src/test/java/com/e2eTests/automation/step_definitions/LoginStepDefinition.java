package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader ();
		seleniumUtils = new SeleniumUtils();
	}
	

	/* login valid */
	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() {
		//Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//Setup.getDriver().get(configFileReader.getProperties("home.url"));
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		//LoginPage.getEmail().sendKeys(configFileReader.getProperties("home.login"));
		/*
		LoginPage.getEmail().clear();
		LoginPage.getEmail().sendKeys(email);
		*/
		
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}

	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		/*
		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(login);
		*/
		seleniumUtils.writeText(LoginPage.getPassword(), login);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		//LoginPage.getBtnLogin().click();
		seleniumUtils.click(LoginPage.getBtnLogin());
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	}

	/* login invalid */
	@Then("Je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {
	}
	
	/*Outline*/
	@Then("Je verifie le message {string}")
	public void jeVerifieLeMessage(String message) {
	}




}
