import { Page, Locator } from "@playwright/test";

export class Registerpage{
    readonly page: Page;
    readonly myacc :Locator;
    readonly reg : Locator;
    readonly fname : Locator;
    readonly lname : Locator;
    readonly email:Locator;
    readonly tele : Locator;
    readonly password:Locator;
    readonly conpass : Locator;
    readonly pp : Locator;
    readonly continue:Locator;
    readonly confirm:Locator;

    constructor(page:Page){
        this.page = page;
        this.myacc = page.locator("//span[normalize-space()='My Account']");
        this.reg = page.locator("//a[normalize-space()='Register']");
        this.fname = page.locator("//input[@id='input-firstname']");
        this.lname = page.locator("//input[@id='input-lastname']");
        this.email = page.locator("//input[@id='input-email']");
        this.tele = page.locator("//input[@id='input-telephone']");
        this.password = page.locator("//input[@id='input-password']");
        this.conpass =page.locator("//input[@id='input-confirm']");
        this.pp = page.locator("//input[@name='agree']");
        this.continue = page.locator("//input[@value='Continue']");
        this.confirm = page.locator("//h1[normalize-space()='Your Account Has Been Created!']");
    }

    async loginsite(){
        await this.page.goto("https://tutorialsninja.com/demo/");
    }
    async myaccclk(){
        await this.myacc.click();
        await this.reg.click();
    }

    async enterdet(fname:string,lname:string,email:string,tele:string,password:string,conpass:string){
        await this.fname.fill(fname);
        await this.lname.fill(lname);
        await this.email.fill(email);
        await this.tele.fill(tele);
        await this.password.fill(password);
        await this.conpass.fill(conpass);
        await this.pp.click();
        await this.continue.click();
    }

    async checklogin(){
         return await this.confirm.textContent();
    }


}