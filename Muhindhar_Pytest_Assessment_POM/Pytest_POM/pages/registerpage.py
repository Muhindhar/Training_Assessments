from selenium.webdriver.common.by import By

class Registerpage:
    myacc = (By.XPATH,"//span[normalize-space()='My Account']")
    reg = (By.XPATH,"//a[normalize-space()='Register']")
    fname = (By.XPATH,"//input[@id='input-firstname']")
    lname = (By.XPATH,"//input[@id='input-lastname']")
    email = (By.XPATH,"//input[@id='input-email']")
    tel = (By.XPATH,"//input[@id='input-telephone']")
    pass1 =(By.XPATH,"//input[@id='input-password']")
    passc = (By.XPATH,"//input[@id='input-confirm']")
    pp = (By.XPATH,"//input[@name='agree']")
    contbtn = (By.XPATH,"//input[@value='Continue']")
    check = (By.XPATH,"//h1[normalize-space()='Your Account Has Been Created!']")
    