package com.definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.actions.SearchActions;
import com.pages.SearchPage;
import com.utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefinition {

	SearchActions sa = new SearchActions();
	SearchPage sp = new SearchPage();
	WebDriver driver = HelperClass.getdriver();
	String productname;

	@Given("the user is on homepage of tutorialsninja site")
	public void the_user_is_on_homepage_of_tutorialsninja_site() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("TutorialsNinja site is opened");
	}
	@Given("user clicks on the search bar")
	public void user_clicks_on_the_search_bar() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(sp.search).click();
	}
	@When("user enters the product name as {string} and clicks search")
	public void user_enters_the_product_name_as_and_clicks_search(String string) {
		// Write code here that turns the phrase above into concrete actions
		productname = string;
		sa.product(string);
	}
	@Then("search result should {string} the product")
	public void search_result_should_the_product(String string) {
		String text = driver.findElement(sp.product).getText();
		if(string.equalsIgnoreCase("contain")) {
			Assert.assertTrue(text.contains(productname));
		}
		else if(string.equalsIgnoreCase("not contain")) {
			Assert.assertTrue(text.contains("There is no product that matches the search criteria."));
		}
	}
}