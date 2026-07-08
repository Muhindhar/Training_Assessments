from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium import webdriver
from selenium.webdriver.common.by import By

driver= webdriver.Chrome()
driver.get("https://parabank.parasoft.com/parabank/register.htm")
driver.maximize_window()
wait = WebDriverWait(driver,10)

fname =wait.until(EC.visibility_of_element_located((By.XPATH,"//input[@id='customer.firstName']")))
fname.send_keys("demouserrr")
lname= driver.find_element(By.XPATH,"//input[@id='customer.lastName']").send_keys("sv")
address = driver.find_element(By.XPATH,"//input[@id='customer.address.street']").send_keys("salem")
city= driver.find_element(By.XPATH,"//input[@id='customer.address.city']").send_keys("salem")
regstate=driver.find_element(By.XPATH,"//input[@id='customer.address.state']").send_keys("Tamilnadu")
zipcode=driver.find_element(By.XPATH,"//input[@name='customer.address.zipCode']").send_keys("321321")
regphone=driver.find_element(By.XPATH,"//input[@id='customer.phoneNumber']").send_keys("9087654324")
ssn = driver.find_element(By.XPATH,"//input[@id='customer.ssn']").send_keys("12345")
uname=driver.find_element(By.XPATH,"//input[@id='customer.username']").send_keys("Demouser123")
password =driver.find_element(By.XPATH,"//input[@id='customer.password']").send_keys("0987654321")
confirmpass =driver.find_element(By.XPATH,"//input[@id='repeatedPassword']").send_keys("0987654321")
register =driver.find_element(By.XPATH,"//input[@value='Register']").click()

billpay =wait.until(EC.element_to_be_clickable((By.XPATH,"//a[normalize-space()='Bill Pay']"))).click()
payeename= wait.until(EC.visibility_of_element_located((By.XPATH,"//input[@name='payee.name']"))).send_keys("Muhindhar")
add =driver.find_element(By.XPATH,"//input[@name='payee.address.street']").send_keys("Salem")
city= driver.find_element(By.XPATH,"//input[@name='payee.address.city']").send_keys("Salem")
state= driver.find_element(By.XPATH,"//input[@name='payee.address.state']").send_keys("tamilnadu")
zipcode= driver.find_element(By.XPATH,"//input[@name='payee.address.zipCode']").send_keys("676568")
phone = driver.find_element(By.XPATH,"//input[@name='payee.phoneNumber']").send_keys("9087654565")
acc= driver.find_element(By.XPATH,"//input[@name='payee.accountNumber']").send_keys("123456789")
veriacc = driver.find_element(By.XPATH,"//input[@name='verifyAccount']").send_keys("123456789")
amount =driver.find_element(By.XPATH,"//input[@name='amount']").send_keys("1")
sendpay= driver.find_element(By.XPATH,"//input[@value='Send Payment']").click()
amountcheck=wait.until(EC.visibility_of_element_located((By.ID,"amount"))).text
print(amountcheck)

accounts = wait.until(EC.element_to_be_clickable((By.XPATH,"//a[normalize-space()='Accounts Overview']")))
accounts.click()
totbal = wait.until(EC.visibility_of_element_located((By.XPATH, "//b[text()='Total']/ancestor::tr/td[2]"))).text
print("total balance :", totbal)
assert totbal != ""
print("balance checked")
