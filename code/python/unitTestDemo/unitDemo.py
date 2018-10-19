import unittest

class TestDemo(unittest.TestCase):

    def test_a(self):
        print("test_a")

    def test_b(self):
        print('test_b')

    def test_c(self):
        print('test_c')

if __name__=='__main__':
    s=unittest.TestSuite()
    s.addTest(TestDemo('test_a'))
    # s.addTest(TestDemo('test_b'))
    r=unittest.TextTestRunner()
    r.run(s)
