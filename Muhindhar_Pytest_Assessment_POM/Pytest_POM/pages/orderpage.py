from selenium.webdriver.common.by import By

class orderpage:
    search = (By.NAME,"search")
    sbtn = (By.XPATH,"//button[contains(@class,'btn-default')]")
    macbook = (By.LINK_TEXT,"MacBook")
    addcart = (By.XPATH,"//button[@id='button-cart']")
    cart = (By.XPATH,"//span[@id='cart-total']")