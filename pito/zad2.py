import unittest

def calculate_tax(gross, tax_rate, age):
    if age <= 18:
        result = gross * tax_rate
        return min(result, 5000)
    elif age > 18 and age <= 65:
        result = gross * tax_rate
        return result
    else:
        result = gross * tax_rate
        return min(result, 8000)

def test_calculate_tax():
    assert calculate_tax(70000, 0.16, 15) == 5000
    assert calculate_tax(70000, 0.16, 18) == 5000
    assert calculate_tax(70000, 0.16, 20) == 11200
    assert calculate_tax(70000, 0.16, 40) == 11200
    assert calculate_tax(70000, 0.16, 65) == 11200
    assert calculate_tax(70000, 0.16, 67) == 8000

if __name__ == '__main__':
    test_calculate_tax()
    print('All tests passed')
    
