import { Before, After, AfterAll, BeforeAll, Status, setDefaultTimeout } from '@cucumber/cucumber'
import { chromium, Browser } from '@playwright/test'
import { muhiworld } from '../world/customworld';
import { Registerpage } from '../page/registerpage';
import { LoginPage } from '../page/loginpage';

let browser: Browser;
setDefaultTimeout(60*1000)
BeforeAll(async()=>{
    browser = await chromium.launch({ headless: false });
});

Before(async function(this: muhiworld, scenario) {
    this.browser = browser;
    this.context = await browser.newContext();
    this.page = await this.context.newPage();
    this.register = new Registerpage(this.page)
    this.login = new LoginPage(this.page)
});

After(async function (this: muhiworld, scenario) {
    if (scenario.result?.status == Status.FAILED) {
        const path = `reports/screenshots/${scenario.pickle.name}.png`;
        await this.page.screenshot({path});
    }
    await this.page.close();
    await this.context.close();
})

AfterAll(async () => {
    await browser.close();
});