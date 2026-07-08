import { Given,When,Then } from "@cucumber/cucumber";
import { muhiworld } from "../world/customworld";
import { expect } from "@playwright/test";


Given('user is on the register page of the demo web shop website', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.navigate();
});

Given('user clicks on the register link', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.clickreglink();
});

Given('user clicks the gender as {string}', async function (this:muhiworld,string) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.clickgender();
});

Given('user enters the valid first name as {string}', async function (this:muhiworld,string) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.enterfname(string)
});

Given('user enters the valid last name as {string}', async function (this:muhiworld,string) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.enterlname(string)
});

Given('user enters the valid email as {string}', async function (this:muhiworld,string) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.enteremail(string)
});

Given('user enters password {string}', async function (this:muhiworld,string) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.enterpass(string)
});

Given('user enters the confirm password {string}', async function (this:muhiworld,string) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.enterconpass(string)
});

When('user clicks on the register button', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
  await this.register.clickregbtn();
});

Then('user should be able to login successfully', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
  const msg = await this.register.checklogin();
  await expect (msg).toContain("Your registration completed");
});