from selenium import webdriver
from time import sleep
from selenium.webdriver.common.action_chains import  ActionChains
from selenium.webdriver.common.by import By
driver = webdriver.Firefox()
driver.maximize_window()

driver.get("http://localhost:8032/mymovie/admin.php/Login/index.html")
driver.find_element(By.ID,"kw").send_keys("taobao")
driver.find_element(By.ID,"su").click()
# driver.back()
# driver.refresh()
# driver.forward()
