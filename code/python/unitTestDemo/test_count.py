from unitTestDemo.count import Calculator
# 测试两个整数相加
class TestCount:

    def test_add(self):
        try:
            c = Calculator(1,4)
            result = c.add()
            assert(result == 6),'Integer addition result error!'
        except AssertionError as msg:
            print(msg)
        else:
            print('test pass!')



if __name__ == '__main__':
    # 执行测试类的测试方法
    test = TestCount()
    test.test_add()

