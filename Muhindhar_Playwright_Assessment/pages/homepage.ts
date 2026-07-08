import { Page,Locator } from "@playwright/test";

export class Homepage{
    readonly page:Page;
    readonly checkhome:Locator;

    constructor(page:Page){
        this.page = page;
        this.checkhome= page.locator("//a[normalize-space()='Qafox.com']");
    }
    async homepagevis(){
        return  await (this.checkhome).isVisible();
    }
}