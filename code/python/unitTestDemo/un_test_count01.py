#使用unittest单元测试框架编写单元测试用例。
import unittest
from unitTestDemo.count import Calculator

# 测试两个整数相加
class TestCount(unittest.TestCase):

    def aa(self):
        print("aaaaa")
    def test_add(self):
        c = Calculator(2,4)
        result = c.add()
        self.assertEqual(result, 6)

    def test_add1(self):
        c = Calculator(2,3)
        result = c.add()
        print(result)
        self.assertEqual(result, 5)

if __name__ == '__main__':
    unittest.main()
