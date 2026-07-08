import {Page, Locator } from '@playwright/test'

export class Searchpage{
    readonly page:Page;
    readonly searchbar : Locator;
    readonly clksearch:Locator;

    constructor(page:Page){
        this.page = page;
        this.searchbar = page.locator("//input[@placeholder='Search']");
        this.clksearch=page.locator("//button[@class='btn btn-default btn-lg']");
}

    async seacrpro(product:string){
        await this.searchbar.fill(product);
        await this.clksearch.click();
    }

}