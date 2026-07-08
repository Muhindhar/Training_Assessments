import {test as base, expect} from '@playwright/test';
import { Registerpage } from '../pages/registerpage';
import { Loginpage } from '../pages/loginpage';
import { Searchpage } from '../pages/searchpage';
import { Product } from '../pages/productpage';
import { Homepage } from '../pages/homepage';

type fixtre = {
    register : Registerpage;
    login : Loginpage;
    search:Searchpage;
    product:Product;
    home:Homepage

};

export const test = base.extend<fixtre>({
    register:async ({page}, use)=>{
        await use (new Registerpage(page));
    },
    login:async({page}, use)=>{
        await use (new Loginpage(page));
    },
    search:async({page}, use)=>{
        await use (new Searchpage(page));
    },
    product:async({page}, use)=>{
        await use (new Product(page));
    },
    home:async({page}, use)=>{
        await use (new Homepage(page));
    },

})

export{expect}