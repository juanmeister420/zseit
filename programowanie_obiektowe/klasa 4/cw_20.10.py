# create KontoBankowe class with saldo attribute
# add method wplata(), which adds money to saldo
# add method wyplata(), which subtracts money from saldo (if there is enough money)

class KontoBankowe:
    def __init__(self, saldo):
        self.saldo = saldo

    def wplata(self, kwota):
        self.saldo += kwota

    def wyplata(self, kwota):
        if self.saldo >= kwota:
            self.saldo -= kwota
            return True
        else:
            print("Brak wystarczających środków na koncie")
            return False



konto = KontoBankowe(1000)
konto_2 = KontoBankowe(2000)

print(f"Saldo konta 1: {konto.saldo} \nSaldo konta 2: {konto_2.saldo}")
print("Wpłata 3000 zł na konto 1")
konto.wplata(3000)
print(f"Saldo konta 1: {konto.saldo} \nSaldo konta 2: {konto_2.saldo}")
print("Wypłata 100 zł z konta 2")
konto_2.wyplata(100)
print(f"Saldo konta 1: {konto.saldo} \nSaldo konta 2: {konto_2.saldo}")
