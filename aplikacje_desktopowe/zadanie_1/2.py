class Person:
    def __init__(self, imie):
        self.imie = imie
        self.przedstaw_sie()
    
    def przedstaw_sie(self):
        print(f"Cześć jestem {self.imie}")

p1 = Person("Adam")