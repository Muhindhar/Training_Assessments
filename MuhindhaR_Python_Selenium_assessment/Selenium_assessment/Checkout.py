from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.relative_locator import locate_with
from selenium.webdriver.support.ui import WebDriverWait

driver = webdriver.Chrome()
driver.maximize_window()
driver.get("http://automationexercise.com")
wait= WebDriverWait(driver,10)

def jsclick(element):
    driver.execute_script("arguments[0].click();", element)

signup = driver.find_element(By.XPATH,"//a[normalize-space()='Signup / Login']")
jsclick(signup)
name = driver.find_element(By.XPATH,"//input[@name='name']")
mail =driver.find_element(By.XPATH,"//input[@data-qa='signup-email']")
driver.find_element(locate_with(By.XPATH,"//input[@name='name']").above(mail)).send_keys("Muhindhar")
driver.find_element(locate_with(By.XPATH,"//input[@data-qa='signup-email']").below(name)).send_keys("muhidemo7@gmail.com")
signinbtn = driver.find_element(By.XPATH,"//button[normalize-space()='Signup']")
jsclick(signinbtn)
title= driver.find_element(By.XPATH,"//input[@id='id_gender1']")
jsclick(title)
password = driver.find_element(By.XPATH,"//input[@id='password']").send_keys("123456789")
day =driver.find_element(By.XPATH,"//select[@id='days']").send_keys("1")
month = driver.find_element(By.XPATH,"//select[@id='months']").send_keys("January")
year = driver.find_element(By.XPATH,"//select[@id='years']").send_keys("2021")
newsletter = driver.find_element(By.XPATH,"//input[@id='newsletter']").click()
fname = driver.find_element(By.XPATH,"//input[@id='first_name']").send_keys("Muhindhar")
lname = driver.find_element(By.XPATH,"//input[@id='last_name']").send_keys("SV")
company = driver.find_element(By.XPATH,"//input[@id='company']").send_keys("Null")
address = driver.find_element(By.XPATH,"//input[@id='address1']").send_keys("Salem")
state = driver.find_element(By.XPATH,"//input[@id='state']").send_keys("tamilnadu")
city = driver.find_element(By.XPATH,"//input[@id='city']").send_keys("salem")
zipcode = driver.find_element(By.XPATH,"//input[@id='zipcode']").send_keys("656776")
mobile = driver.find_element(By.XPATH,"//input[@id='mobile_number']").send_keys("9087876567")
createacc = driver.find_element(By.XPATH,"//button[normalize-space()='Create Account']")
jsclick(createacc)
accreated=driver.find_element(By.XPATH,"//b[normalize-space()='Account Created!']").text
print(accreated)
ctnbtn= driver.find_element(By.XPATH,"//a[@class='btn btn-primary']")
jsclick(ctnbtn)
username = driver.find_element(By.XPATH, "//ul[@class = 'nav navbar-nav']/descendant::a[text() = ' Logged in as ']").text
print(username)
checkuser =username
if "Logged in as Muhindhar" in checkuser:
    print("The Logged username is show")
else:
    print("The logged username is not show")
product = driver.find_element(By.XPATH,"//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
jsclick(product)
addtocart= driver.find_element(By.XPATH,"//button[@type='button']")
jsclick(addtocart)
viewcart = wait.until(EC.element_to_be_clickable(driver.find_element(By.XPATH,"//u[normalize-space()='View Cart']")))
jsclick(viewcart)
protocheck = driver.find_element(By.XPATH,"//a[@class='btn btn-default check_out']")
jsclick(protocheck)
placeorder= driver.find_element(By.XPATH,"//a[@class='btn btn-default check_out']").click()
deladd = driver.find_element(By.XPATH,"//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Salem']").text
billadd = driver.find_element(By.XPATH,"//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Salem']").text
print(deladd)
print(billadd)
delacc = driver.find_element(By.XPATH,"//a[normalize-space()='Delete Account']")
jsclick(delacc)
okbtn=driver.find_element(By.XPATH,"//a[@class='btn btn-primary']")
jsclick(okbtn)
driver.quit()
