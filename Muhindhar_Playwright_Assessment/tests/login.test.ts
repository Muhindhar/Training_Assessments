import {test,expect} from '../fixtures/basefixture';
import login from '../datafile/login.json';

test.describe("Login @Regression", async()=>{
    test.beforeEach("logging in to site", async({register,login})=>{
        register.loginsite();
        login.loginstep();

    })
    for(const user of login){
        test(`login with data ${user.type}`, async ({ login }) => {
            await login.enterlogindet(user.email, user.password);
            if(user.type==="valid"){
                await expect(login.loggedin).toHaveText("My Account")
            }
            else if(user.type==="invalidEmail"){
                await expect(login.wrongpass).toHaveText("Warning: No match for E-Mail Address and/or Password.");
            }
            else if(user.type=="wrongPassword"){
                await expect(login.wrongpass).toHaveText("Warning: No match for E-Mail Address and/or Password.");
            }
        })

    }
})