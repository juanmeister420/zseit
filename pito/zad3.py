from token import COMMA
import unittest

class TestSplitMethod(unittest.TestCase):
    def test_split_by_default(self):
        self.assertEqual('Maciej Monkiewicz'.split(), ['Maciej', 'Monkiewicz'])
    
    def test_split_by_znak(self):
        self.assertEqual('Maciej, Monkiewicz, klasa, 4TP'.split(', '), ['Maciej', 'Monkiewicz', 'klasa', '4TP'])

if __name__ == '__main__':
    unittest.main()
    


        