import { Page, Locator } from "@playwright/test";

export class Product {
    readonly checkpro: Locator;
    
    constructor(page: Page) {
        this.checkpro = page.locator("//h1[normalize-space()='Search - MacBook']");
    }
    async checkproduct() {
        return await this.checkpro.isVisible();
    }
}