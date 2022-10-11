import unittest

class TestJoinMethod(unittest.TestCase):
    def test_join_by_default(self):
        self.assertEqual(' '.join(['Maciej', 'Monkiewicz']), 'Maciej Monkiewicz')

    def test_join_by_znak(self):
        self.assertEqual(','.join(['Pracownia', 'Testowania', 'Projektowania', 'Aplikacji']), 'Pracownia,Testowania,Projektowania,Aplikacji')

if __name__ == '__main__':
    unittest.main()
