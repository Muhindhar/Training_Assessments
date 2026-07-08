from selenium.webdriver.common.by import By

class SearchPage:

    search = (By.XPATH, "//input[@placeholder='Search']")
    sbtn = (By.XPATH, "//button[contains(@class,'btn-default')]")
    check = (By.XPATH, "//div[@id='content']//h1")