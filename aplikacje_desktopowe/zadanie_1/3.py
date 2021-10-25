class Person:
    def __init__(self, imie, nazwisko, wiek, zawod):
        self.imie = imie
        self.nazwisko = nazwisko
        self.wiek = wiek
        self.zawod = zawod
        self.przedstaw_sie()
    
    def przedstaw_sie(self):
        print(f"Cześć jestem {self.imie}")

p1 = Person("Adam", "Kowalski", 23, "Konserwator powierzchni płakich")
p2 = Person("Stefan", "Nowak", 48, "Spawacz")
p3 = Person("Klaudia", "Kozioł", 22, "Psycholog")

print(p2.__dict__)