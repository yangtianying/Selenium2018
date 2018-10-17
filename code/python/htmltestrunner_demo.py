import  unittest
from selenium import webdriver
import  time
from HTMLTestRunner import  HTMLTestRunner

class MymovieDemo(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.maximize_window()
        self.driver.implicitly_wait(5)
        self.base_url="http://localhost:8032/mymovie/admin.php"

    def test_login(self):
        '''测试登陆

        '''
        driver = self.driver
        driver.get(self.base_url)
        driver.find_element_by_name("username").send_keys("admin")
        driver.find_element_by_name("password").send_keys("admin")
        driver.find_element_by_class_name("sub").click()
        time.sleep(3)
        self.assertIn("退出",driver.page_source)

    def tearDown(self):
        self.driver.quit()

if __name__ =="__main__":
    # unittest.main()

    testunit = unittest.TestSuite()
    testunit.addTest(MymovieDemo("test_login"))

    now = time.strftime("%Y%m%d%H%M%S")
    print(now)

    fp =open("D:\\pythonCode\\Demo2\\unitTestDemo\\"+now+"result.html","wb")
    runner = HTMLTestRunner(stream=fp,title='测试报告',description='用例执行情况：')
    runner.run(testunit)
    fp.close()
