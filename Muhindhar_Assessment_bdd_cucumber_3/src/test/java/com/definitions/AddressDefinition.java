package com.definitions;

import java.util.List;
import java.util.Map;

import com.actions.AddressAction;
import com.pages.AddressPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressDefinition {
	AddressAction aa = new AddressAction();
	AddressPage adp = new AddressPage();
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Page opened");
	}

	@Given("user enters the valid credentials to login")
	public void user_enters_the_valid_credentials_to_login() {
		// Write code here that turns the phrase above into concrete actions
		aa.login();
	}

	@Given("user clicks on the Address book link")
	public void user_clicks_on_the_address_book_link() {
		// Write code here that turns the phrase above into concrete actions
		aa.Address();
	}

	@When("user clicks on the new address button")
	public void user_clicks_on_the_new_address_button() {
		// Write code here that turns the phrase above into concrete actions
		aa.newadd();
	}

	@When("user enters the details")
	public void user_enters_the_details(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> data = dataTable.asMaps();
		aa.det(data);
	}

	@When("clicks on continue button")
	public void clicks_on_continue_button() {
		// Write code here that turns the phrase above into concrete actions
		aa.clickbtn();
	}

	@Then("user should be able to see the address")
	public void user_should_be_able_to_see_the_address() {
		// Write code here that turns the phrase above into concrete actions
		aa.check();
	}

}
