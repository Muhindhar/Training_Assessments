import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

@pytest.fixture
def driver():
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://practice.automationtesting.in/shop/")
    yield driver
    driver.quit()
    
    
@pytest.mark.smoke
def test_one(driver):
    driver.find_element(By.XPATH, "//img[@title='Mastering HTML5 Forms']").click()
    amount = driver.find_element(By.XPATH, "//span[@class='woocommerce-Price-amount amount']").text
    price = amount.replace("₹", "").strip()
    print("HTML5 Book Price:", price)
    assert price == "280.00"
    
@pytest.mark.smoke
def test_two(driver):
    jsdsa = driver.find_element(By.XPATH, "//img[@title='Learning JavaScript Data Structures and Algorith']")
    driver.execute_script("arguments[0].click();", jsdsa)
    exp_url = "https://practice.automationtesting.in/product/learning-javascript-data-structures-and-algorithm/"
    assert driver.current_url == exp_url
    title = driver.find_element(By.XPATH, "//h1[@class='product_title entry-title']").text
    assert title == "JS Data Structures and Algorithm"


@pytest.mark.regression
def test_three(driver):
    driver.find_element(By.XPATH, "//a[contains(text(),'HTML')]").click()
    books = driver.find_elements(By.XPATH, "//ul[contains(@class,'products')]/li")
    count = len(books)
    print("Book Count:", count)
    assert count == 3


@pytest.mark.regression
def test_four(driver):
    sortbtn = Select(driver.find_element(By.NAME, "orderby"))
    sortbtn.select_by_value("price")
    prices = driver.find_elements(By.XPATH, "//span[@class='woocommerce-Price-amount amount']")
    actual_prices = []
    for p in prices:
        value = p.text.replace("₹","").replace(",","").strip()
        actual_prices.append(float(value))
    print(actual_prices)
    assert actual_prices == sorted(actual_prices)

@pytest.mark.regression
def test_five(driver):
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")
    subsbtn = driver.find_element(By.XPATH, "//input[@value='Subscribe']")
    assert subsbtn.is_displayed()
    print(subsbtn.get_attribute("value"))
