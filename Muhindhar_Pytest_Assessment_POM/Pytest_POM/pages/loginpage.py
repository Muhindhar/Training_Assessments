from selenium.webdriver.common.by import By
class LoginPage:
    myacc = (By.XPATH,"//span[normalize-space()='My Account']")
    login = (By.XPATH,"//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    email = (By.XPATH,"//input[@id='input-email']")
    passw = (By.XPATH,"//input[@id='input-password']")
    contn = (By.XPATH,"//input[@value='Login']")
    warn = (By.XPATH,"//div[@class='alert alert-danger alert-dismissible']")
    