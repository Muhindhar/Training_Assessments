import { Locator, Page } from "@playwright/test";

export class BasePage{

    readonly page:Page;
    
    constructor(page:Page){
        this.page = page 
    }

    async click(locator:Locator){
        await locator.click();
    }
    async fill(locator:Locator,value:string){
        await locator.fill(value);
    }
    async getText(locator:Locator){
        return locator.textContent();
    }

}