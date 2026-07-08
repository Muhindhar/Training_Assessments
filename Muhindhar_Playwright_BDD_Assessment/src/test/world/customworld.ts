import { setWorldConstructor,World } from "@cucumber/cucumber";
import { Browser, BrowserContext,Page } from '@playwright/test';
import { Registerpage } from "../page/registerpage";
import { LoginPage } from "../page/loginpage";


export class muhiworld extends World{
    browser!:Browser
    page!:Page
    context!:BrowserContext   
    register!:Registerpage
    login!:LoginPage
}

setWorldConstructor(muhiworld);