# Inicjalizacja klasy BankAccount
#
# Klasa przechowuje informacje o koncie bankowym
# oraz metody do zarządzania nimi
# deposit - wpłata środków na konto
# withdraw - wypłata środków z konta
# checkBalance - sprawdzenie stanu konta
# getAccountNumber - pobranie numeru konta


class BankAccount:
    def __init__(self, accountNumber, balance):
        self.accountNumber = accountNumber
        self.balance = balance
    
    def deposit(self, amount):
        self.balance += amount
    
    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient balance")
        else:
            self.balance -= amount
    
    def checkBalance(self):
        return self.balance
    
    def getAccountNumber(self):
        return self.accountNumber

class Transaction:
    def __init__(self, date, amount, description):
        self.date = date
        self.amount = amount
        self.description = description
