import {test,expect} from '@playwright/test';

test("firefox test", async({page})=>{
    await page.goto("https://www.bing.com/");
    console.log("page title : ",await page.title());
    console.log("current url : ",await page.url());
    await expect(page).toHaveTitle("Search - Microsoft Bing");
    await expect(page).toHaveURL("https://www.bing.com/");
    const text = await page.locator("//a[normalize-space()='Images']").innerText();
    console.log("Inner Text:", text);
    const att = await page.locator("//textarea[@id='sb_form_q']").getAttribute("placeholder");
    console.log("Attribute:", att);
    const search = await page.locator("//textarea[@id='sb_form_q']").fill("playwright");
    await page.keyboard.press("Enter");
    const check = await page.locator("//div[@class='b_tpcn']").first().click();
    console.log(check);
    await expect(page).toHaveTitle("playwright - Search");
})  