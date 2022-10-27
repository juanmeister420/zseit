# Erstellen Sie eine Fahrzeugklasse mit:
# - Initialisierer - ist für die Erstellung von Objekten der Fahrzeugklasse verantwortlich (3 Eigenschaften)
# - eine Methode

###
# CZESC 1
###
class Vehicle:
    def __init__(self, brand, model, color):
        self.brand = brand
        self.model = model
        self.color = color

    def get_vehicle(self):
        return f"{self.brand} {self.model} {self.color}"

###
# CZESC 2
###

# Erstellen Sie Klassen: LandVehicle, AirVehicle, WaterVehicle, die von der Vehicle-Klasse 
# erben (stellen Sie eine Eigenschaft und eine Methode von Objekten bereit, die für jede dieser
# Klassen charakteristisch sind).

class LandVehicle(Vehicle):
    def __init__(self, brand, model, color, wheels):
        super().__init__(brand, model, color)
        self.wheels = wheels

    def get_vehicle(self):
        return f"{super().get_vehicle()} {self.wheels}"

class AirVehicle(Vehicle):
    def __init__(self, brand, model, color, wings):
        super().__init__(brand, model, color)
        self.wings = wings

    def get_vehicle(self):
        return f"{super().get_vehicle()} {self.wings}"

class WaterVehicle(Vehicle):
    def __init__(self, brand, model, color, propeller):
        super().__init__(brand, model, color)
        self.propeller = propeller

    def get_vehicle(self):
        return f"{super().get_vehicle()} {self.propeller}"


###
# CZESC 3
###

# Erstellen Sie zwei Instanzen erbender Klassen.

car = LandVehicle("BMW", "X5", "black", 4)
plane = AirVehicle("Boeing", "747", "white", 2)


###
# CZESC 4
###
print(car.get_vehicle())
print(plane.get_vehicle())