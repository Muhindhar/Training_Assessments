import pytest
from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from config_reader import get_config

@pytest.fixture
def setup_teardown(request):
    browser = get_config("basic info","browser").lower()
    if browser == "chrome":
        driver = webdriver.Chrome()
    elif browser == "edge":
        driver = webdriver.Edge()
    elif browser == "firefox":
        driver = webdriver.Firefox()

    driver.maximize_window()
    wait = WebDriverWait(driver,10)
    driver.get(get_config("basic info","url"))
    request.cls.driver = driver
    request.cls.wait = wait
    yield
    driver.quit()
    
