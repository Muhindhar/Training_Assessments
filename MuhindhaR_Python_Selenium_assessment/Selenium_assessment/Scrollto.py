from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait

driver = webdriver.Chrome()
driver.maximize_window()
driver.get("https://automationexercise.com/")
wait = WebDriverWait(driver, 10)
home=wait.until(EC.visibility_of_element_located((By.XPATH, "//img[@alt='Website for automation practice']")))
if home.is_displayed():
    print("home page visible")
else:
    print("home page not visible")
driver.execute_script("window.scrollTo(0, 1000);")
subs=wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[normalize-space()='Subscription']")))
if subs.is_displayed():
    print("subscription visible")
else:
    print("subscription  not visible")
arr = wait.until(EC.element_to_be_clickable((By.ID, "scrollUp")))
driver.execute_script("arguments[0].click();", arr)
textvisb = wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[normalize-space()='Full-Fledged practice website for Automation Engineers']")))
if textvisb.is_displayed():
    print("text visible")
else:
    print("not visible")
driver.quit()