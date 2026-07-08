import { Page,Locator } from "@playwright/test";

export class Loginpage{
    readonly page:Page;
    readonly myacc:Locator;
    readonly loginlink:Locator;
    readonly email:Locator;
    readonly password:Locator;
    readonly loginbtn : Locator;
    readonly wrongpass : Locator;
    readonly loggedin:Locator;
    
    constructor(page:Page){
        this.page = page
        this.myacc = page.locator("//span[normalize-space()='My Account']");
        this.loginlink = page.locator("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");
        this.email = page.locator("//input[@id='input-email']");
        this.password = page.locator("//input[@id='input-password']");
        this.loginbtn = page.locator("//input[@value='Login']"); 
        this.wrongpass = page.locator("//div[@class='alert alert-danger alert-dismissible']");
        this.loggedin = page.locator("//h2[normalize-space()='My Account']")
    }

    async loginstep(){
        await this.myacc.click();
        await this.loginlink.click();
    }
    async enterlogindet(email:string,password:string){
        await this.email.fill(email);
        await this.password.fill(password);
        await this.loginbtn.click();
    } 
    async logged(){
        return await this.loggedin.textContent();
    }

    async wrongpasscheck(){
        return await this.wrongpass.textContent();
    }


    
}