import { Given,When,Then } from "@cucumber/cucumber";
import { muhiworld } from "../world/customworld";
import { logindet,csvdata } from "../../utilities/csvreader";
import { expect } from "@playwright/test";

let loginDetails: logindet;
Given('user is on the login page of the demowebshop website', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
  await this.login.navigation();
});

Given('user enters the credentials {string}',async function (this:muhiworld,type: string) {
    // Write code here that turns the phrase above into concrete actions
    const data = csvdata();
    const user = data.find(item=>item.type===type);
    if (!user) {
      throw new Error(`No login data found for type:${type}`);
    }
    loginDetails = user;
    await this.login.enteremail(loginDetails.email);
    await this.login.enterpass(loginDetails.password);
});

When('user clicks on the login button', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
  await this.login.clkloginbtn();
});

Then('user should see the corresponding messages', async function (this:muhiworld) {
  // Write code here that turns the phrase above into concrete actions
    if (loginDetails.type === "valid") {
    expect(await this.login.successmsg()).toContain("MUHISV27@GMAIL.COM");
}
    else if(loginDetails.type==="invalidpass"){
        expect(await this.login.errormsg()).toContain("Login was unsuccessful. Please correct the errors and try again."
           +"\nThe credentials provided are incorrect");
    }
    else if(loginDetails.type==="invalidemail"){
         expect(await this.login.errormsg()).toContain("Login was unsuccessful. Please correct the errors and try again."+
           "\nNo customer account found");
    }
    else{
         expect(await this.login.errormsg()).toContain("Login was unsuccessful. Please correct the errors and try again.\n"+
           "No customer account found");
    }

    

});
