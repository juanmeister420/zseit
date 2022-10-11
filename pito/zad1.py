import unittest

class TestLower(unittest.TestCase):
    def test_lower(self):
        self.assertEqual('IMIE'.lower(), 'imie')

    def test_is_lower(self):
        self.assertTrue('imie'.islower())
        self.assertFalse('IMIE'.islower())

if __name__ == '__main__':
    unittest.main()
    