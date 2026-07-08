import { BasePage } from "./basepage";
import dotenv from 'dotenv';
import path from 'path';
dotenv.config({ path: path.resolve(__dirname, '../../../env/loginurl.env') });

export class LoginPage extends BasePage{
    private loginlink = this.page.getByRole('link', { name: 'Log in' });
    private email = this.page.getByRole('textbox', { name: 'Email:' });
    private password = this.page.getByRole('textbox', { name: 'Password:' });
    private loginbtn = this.page.getByRole('button', { name: 'Log in' });
    private error = this.page.locator("//div[@class='validation-summary-errors']");
    private account = this.page.locator("//a[text()='MUHISV27@GMAIL.COM']");


    async navigation(){
        await this.page.goto(process.env.loginurl!)
    }
    async clickloginlink(){
        await this.click(this.loginlink)
    }
    async enteremail(emaill:string){
        await this.fill(this.email,emaill)
    }
    async enterpass(pass:string){
        await this.fill(this.password,pass)
    }
    async clkloginbtn(){
        await this.click(this.loginbtn)
    }
    async successmsg() {
        return await this.getText(this.account);
}
    async errormsg(){
        return this.getText(this.error)
    }
}