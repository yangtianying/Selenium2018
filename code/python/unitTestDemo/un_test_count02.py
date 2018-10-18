'''
使用unittest单元测试框架编写单元测试用例。
使用unittest.TestSuite 添加测试用例到测试套件
使用unittest.TextTestRunner 运行测试用例
'''
import unittest
from unitTestDemo.count import Calculator
class TestCount(unittest.TestCase):

    def setUp(self):
        print("setup")
    def test_add(self):
        print("test_a")
        c = Calculator(2,4)
        result = c.add()
        self.assertEqual(result, 6)


    def test_sub(self):
        c = Calculator(8,3)
        result = c.sub()
        self.assertEqual(result, 5)

    def test_1(self):
        print("test_1")

if __name__ == '__main__':

    suite = unittest.TestSuite()
    suite.addTest(TestCount('test_sub'))
    suite.addTest(TestCount('test_add'))
    runner = unittest.TextTestRunner()
    runner.run(suite)
