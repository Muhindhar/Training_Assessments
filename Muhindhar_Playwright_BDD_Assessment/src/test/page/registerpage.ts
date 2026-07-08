import { BasePage } from "./basepage";
import dotenv from 'dotenv';
import path from 'path';
dotenv.config({ path: path.resolve(__dirname, '../../../env/url.env') });


export class Registerpage extends BasePage{
    private registerlink = this.page.getByRole('link', { name: 'Register' });
    private gender = this.page.getByRole('radio', { name: 'Male', exact: true });
    private fname  = this.page.getByRole('textbox', { name: 'First name:' });
    private lname = this.page.getByRole('textbox', { name: 'Last name:' });
    private email = this.page.getByRole('textbox', { name: 'Email:' });
    private password = this.page.getByRole('textbox', { name: 'Password:', exact: true });
    private conpassword = this.page.getByRole('textbox', { name: 'Confirm password:' });
    private regbtn = this.page.getByRole('button', { name: 'Register' })
    private regdone = this.page.locator("//div[@class='result']")
    
    async navigate(){
        await this.page.goto(process.env.base_url!)
    }
    async clickreglink(){
        await this.click(this.registerlink)
    }
    async clickgender(){
        await this.click(this.gender);
    }
    async enterfname(firstname:string){
        await this.fill(this.fname,firstname)
    }
    async enterlname(lastname:string){
        await this.fill(this.lname,lastname)
    }
    async enteremail(emaill:string){
        await this.fill(this.email,emaill)
    }
    async enterpass(pass:string){
        await this.fill(this.password,pass)
    }
    async enterconpass(conpass:string){
        await this.fill(this.conpassword,conpass)
    }
    async clickregbtn(){
        await this.click(this.regbtn);
    }
    async checklogin(){
        return await this.getText(this.regdone)
    }

}   