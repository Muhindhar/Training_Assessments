package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AccountInfo;
import com.pages.Login;
import com.utilities.Datas;

public class AccountInfoTest extends BaseTest {
    @Test(priority = 1, dataProvider="RegisterData", dataProviderClass=Datas.class)
    public void register(String uname,String email,String password,String fname,String lname,String address,String stat,String cit,String code,String mobile) {
        AccountInfo acc = new AccountInfo(driver, wait);
        acc.accdata(uname, password, fname, lname,address, stat, cit, code, mobile, mobile);
        Assert.assertEquals(acc.gettext(), "Account Created!");
    }
    @Test(priority = 2, dataProvider="RegisterData", dataProviderClass=Datas.class)
    public void registerExisting(String uname,String email,String password,String fname,String lname,String address,String stat, String cit,String code,String mobile) {
        AccountInfo acc = new AccountInfo(driver, wait);
        acc.accdata(uname, email, password, fname, lname,address, stat, cit, code, mobile);
        Assert.assertEquals(acc.getEmailExistsMsg(), "Email Address already exist!");
    }
    @Test(priority = 3, dataProvider="Logindata", dataProviderClass=Datas.class)
    public void validlog(String email, String password) {
        Login l = new Login(driver, wait);
        l.senddata(email, password);
        Assert.assertTrue(l.getLoginText().contains("Logged in as"));
    }
    @Test(priority = 4, dataProvider="InvalidLogin", dataProviderClass=Datas.class)
    public void Invalidlog(String email, String password) {
        Login l = new Login(driver, wait);
        l.inValidLogin(email, password);
        Assert.assertEquals(l.getInvalidCreation(),"Your email or password is incorrect!");
    }
}